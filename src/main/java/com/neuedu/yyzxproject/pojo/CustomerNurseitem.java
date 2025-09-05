package com.neuedu.yyzxproject.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CustomerNurseitem {
    private Integer id;
    private Integer itemId;
    private Integer custormerId;
    private Integer levelId;
    private Integer nurseNumber;
    private Integer isDeleted;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date buyTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date maturityTime;
}
