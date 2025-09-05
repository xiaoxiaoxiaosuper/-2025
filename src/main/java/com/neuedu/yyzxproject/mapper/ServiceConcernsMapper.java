package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.CustomerNurseitem;
import com.neuedu.yyzxproject.pojo.Nursecontent;
import com.neuedu.yyzxproject.pojo.User;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import com.neuedu.yyzxproject.vo.PurchasedNursingServices;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ServiceConcernsMapper {
    public List<CustomerNursingRecords> queryCustomerInfo(Customer customer);

    public List<PurchasedNursingServices> queryCustomerPurchasedNursingService(Customer customer);

    public int deleteCustomerPurchasedNursingService(@Param("nursingServiceId") Integer nursingServiceId);

    public int renewalNursingService(@Param("customerNurseitemId") Integer customerNurseitemId, @Param("newQuantity") Integer newQuantity, @Param("newMaturityTime") Date newMaturityTime);

    public List<Nursecontent> queryNursingService(Nursecontent nursecontent);

    public int selectNursingService(CustomerNurseitem customerNurseitem);
}
