package com.neuedu.yyzxproject.pojo;

import lombok.Data;

@Data
public class Nurselevel {
    private Integer id;
    //-:护理级别
    private String levelName;
    //-:护理状态 1禁用 2启用
    private Integer levelStatus;
    private Integer isDeleted;
}
