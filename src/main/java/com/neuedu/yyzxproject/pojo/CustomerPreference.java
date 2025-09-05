package com.neuedu.yyzxproject.pojo;

import lombok.Data;

@Data
public class CustomerPreference {
    private Integer id;
    private Integer customerId;
    private String preferences;
    private String attention;
    private String remark;
    private Integer isDeleted;
}

