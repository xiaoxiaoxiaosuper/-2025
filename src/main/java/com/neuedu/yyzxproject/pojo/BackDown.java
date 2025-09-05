package com.neuedu.yyzxproject.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class BackDown {
    private Integer id;
    private String remarks;
    private Integer isDeleted;
    private Integer customerId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date retreattime;
    private Integer retreattype;
    private String retreatreason;
    private Integer auditstatus;
    private String auditperson;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date audittime;

    private String customerName;
    private String bedNo;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkinDate;
}
