package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.Nurselevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerNursingMapper {
    List<Customer> queryAllCustomerInfo(Customer customer);

    int deleteCustomerNursingLevel(Customer customer);

    int allocationCustomerNursingLevel(Customer customer, Nurselevel nurselevel);
}
