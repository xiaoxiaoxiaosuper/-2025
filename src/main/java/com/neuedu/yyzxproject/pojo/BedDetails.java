package com.neuedu.yyzxproject.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class BedDetails {
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String bedDetails;
    private Integer customerId;
    private Integer bedId;
    private Integer isDeleted;

    private Integer oldBedId;
}
