package com.neuedu.yyzxproject.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Customer {
    private Integer id;
    private Integer isDeleted;
    private String customerName;
    private Integer customerAge;
    private Integer customerSex;
    private String idCard;
    private String roomNo;
    private String buildingNo;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkinDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expirationDate;
    private String contactTel;
    private Integer bedId;
    private String psychosomaticState;
    private String attention;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date  birthday;
    private String height;
    private String weight;
    private String bloodType;
    private String filePath;
    private Integer userId;
    private Integer levelId;
    private String familyMember;
    //-:补充床位的名称
    private String bedNo;
}
