package com.neuedu.yyzxproject.pojo;

import lombok.Data;

import java.util.Date;

import java.util.List;

@Data

public class User {

    private Integer id;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    private Integer isDeleted;

    private String nickname;

    private String username;

    private String password;

    private Integer sex;

    private String email;

    private String phoneNumber;

    private Integer roleId;

    //-:用户对应的菜单
    private List<Menu> menuList;

}
