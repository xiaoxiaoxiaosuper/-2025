package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.NurseRecord;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import com.neuedu.yyzxproject.vo.PurchasedNursingServices;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NursingRecordsMapper {
    List<CustomerNursingRecords> queryCustomerInfo(Customer customer);

    List<NurseRecord> queryNursingRecords(Customer customer);

    int deleteNursingRecordsById(@Param("nursingRecordsId") Integer nursingRecordsId);
}
