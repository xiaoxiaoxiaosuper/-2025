package com.neuedu.yyzxproject.pojo;

import lombok.Data;

@Data
public class Nursecontent {
    private Integer id;
    private String serialNumber;
    private String nursingName;
    private String servicePrice;
    private String message;
    private Integer status;
    private String executionCycle;
    private String executionTimes;
    private Integer isDeleted;
}
