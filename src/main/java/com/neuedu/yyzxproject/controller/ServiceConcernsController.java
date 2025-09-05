package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.CustomerNurseitem;
import com.neuedu.yyzxproject.pojo.Nursecontent;
import com.neuedu.yyzxproject.service.ServiceConcernsService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("healthSteward")
public class ServiceConcernsController {
    @Autowired
    private ServiceConcernsService serviceConcernsService;
    //-:查询客户信息及护理级别
    @PostMapping("/queryCustomerInfo")
    public ResultVo<CustomerNursingRecords> queryCustomerInfo(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<CustomerNursingRecords> userPageResponseVo = serviceConcernsService.queryCustomerInfo(pageInfoVo,customer);
        return ResultVo.ok(userPageResponseVo);
    }
    //-:查询客户已购护理服务
    @PostMapping("/queryCustomerPurchasedNursingService")
    public ResultVo<PurchasedNursingServices> queryCustomerPurchasedNursingService(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<PurchasedNursingServices> purchasedNursingServicesPageResponseVo = serviceConcernsService.queryCustomerPurchasedNursingService(pageInfoVo,customer);
        return ResultVo.ok(purchasedNursingServicesPageResponseVo);
    }
    //-:移除用户已购护理服务
    @PostMapping("/deleteCustomerPurchasedNursingServiceById")
    public ResultVo deleteCustomerPurchasedNursingServiceById(Integer nursingServiceId){
        int num = serviceConcernsService.deleteCustomerPurchasedNursingServiceById(nursingServiceId);
        if(num>0){
            return ResultVo.ok("删除成功");
        }else{
            return ResultVo.fail("删除失败");
        }
    }
    //-:护理项目续费
    @PostMapping("/renewalNursingService")
    public ResultVo renewalNursingService(
            @RequestParam Integer customerNurseitemId,
            @RequestParam Integer newQuantity,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date newMaturityTime
    ){
        int num = serviceConcernsService.renewalNursingService(customerNurseitemId,newQuantity,newMaturityTime);
        if(num>0){
            return ResultVo.ok("续费成功");
        }else{
            return ResultVo.fail("续费失败");
        }
    }
    //-:查询护理项目
    @PostMapping("/queryNursingService")
    public ResultVo<Nursecontent> queryNursingService(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Nursecontent nursecontent = requestBodyVo.getNursecontent();
        PageResponseVo<Nursecontent> nursecontentPageResponseVo = serviceConcernsService.queryNursingService(pageInfoVo,nursecontent);
        return ResultVo.ok(nursecontentPageResponseVo);
    }
    //-:选择护理项目
    @PostMapping("/selectNursingService")
    public ResultVo selectNursingService(@RequestBody CustomerNurseitem customerNurseitem){
        int num = serviceConcernsService.selectNursingService(customerNurseitem);
        if(num>0){
            return ResultVo.ok("选择成功");
        }else{
            return ResultVo.fail("选择失败");
        }
    }
}
