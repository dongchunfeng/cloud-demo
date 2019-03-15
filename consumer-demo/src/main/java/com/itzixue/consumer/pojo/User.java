package com.itzixue.consumer.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mr.Dong
 * @create 2019-03-14 18:44
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;

    // 备注
    private String note;

}

