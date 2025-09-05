package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import com.neuedu.yyzxproject.vo.FoodManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper {
    public List<Customer> queryAllCustomer(Customer customer);
    public int deleteCustomerById(@Param("customerId") Integer customerId);
    public int saveCustomer(Customer customer);

    List<FoodManage> queryFoodManage(Customer customer);

    List<CustomerNursingRecords> queryCustomerInfo(Customer customer);

    void modifyBedStatus(int bedId);

    int reviseCustomerInfo(Customer customer);

    int getBedIdByCustomerId(Integer customerId);
    void updateBedStatus(Integer bedId);
}
