package com.liuyuan.sc.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AutoFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String requestURI = request.getRequestURI();
        if(requestURI.startsWith("/tuser/")){
            return true;
        }
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println(" 这里被执行了。。。。");
        RequestContext context = RequestContext.getCurrentContext();


        context.setSendZuulResponse(false);

        /** http状态码，标识未授权 **/
        context.setResponseStatusCode(401);

        HttpServletResponse response = context.getResponse();
        /** 设置返回的内容类型 **/
        response.setContentType("application/json;charset=utf-8");
        try {
            response.getWriter().write("{\"message\":\"未授权\"}");
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
