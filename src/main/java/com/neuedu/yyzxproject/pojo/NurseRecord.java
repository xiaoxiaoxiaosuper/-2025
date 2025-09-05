package com.neuedu.yyzxproject.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class NurseRecord {
    private Integer id;
    private Integer isDeleted;
    private Integer customerId;
    private Integer itemId;
    private Date nursingTime;
    private String nursingContent;
    private Integer nursingCount;
    private Integer userId;

    private String serialNumber;
    private String nursingName;

    private Integer nurseNumber;

    private String nickname;
    private String phoneNumber;
}
