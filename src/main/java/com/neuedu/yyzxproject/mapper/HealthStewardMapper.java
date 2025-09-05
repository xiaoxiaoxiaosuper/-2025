package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.User;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HealthStewardMapper {
    public List<User> queryHealthSteward(User user);

    public List<Customer> queryCustomerWithoutSteward(Customer customer);

    public List<CustomerNursingRecords> queryServingCustomerById(User user);

    public int deleteServingCustomer(@Param("customerId") Integer customerId);
}
