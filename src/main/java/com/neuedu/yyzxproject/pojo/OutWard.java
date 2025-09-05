package com.neuedu.yyzxproject.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class OutWard {
    private Integer id;
    private String remarks;
    private Integer isDeleted;
    private Integer customerId;
    private String outgoingReason;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date outgoingTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expectedReturnTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date actualReturnTime;
    private String escorted;
    private String relation;
    private String escortedtel;
    private Integer auditStatus;
    private String auditPerson;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date auditTime;

    private String CustomerName;
}
