package com.liuyuan.sc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liuyuan
 * @since 2020-07-16
 */
@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class Tuser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String name;


}
