package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.service.CustomerService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    //-:查询客户的信息
    @PostMapping("/queryAllCustomer")
    public ResultVo<Customer> queryAllCustomer(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<Customer> pageResponseVo = customerService.queryAllCustomer(pageInfoVo,customer);
        return ResultVo.ok(pageResponseVo);
    }

    @GetMapping("deleteCustomerById")
    public ResultVo deleteCustomerById(Integer customerId){
        int num = customerService.deleteCustomerById(customerId);
        if(num>0){
            return ResultVo.ok("删除成功");
        }else{
            return ResultVo.fail("删除失败");
        }
    }
    //-:保存新用户信息
    @PostMapping("/saveCustomer")
    public ResultVo saveCustomer(@RequestBody Customer customer){
        int num = customerService.saveCustomer(customer);
        if(num>0){
            return ResultVo.ok("保存成功");
        }else{
            return ResultVo.fail("保存失败");
        }
    }
    //-:修改用户信息
    @PostMapping("/reviseCustomerInfo")
    public ResultVo reviseCustomerInfo(@RequestBody Customer customer){
        int num = customerService.reviseCustomerInfo(customer);
        if(num>0){
            return ResultVo.ok("修改成功");
        }else{
            return ResultVo.fail("修改失败");
        }
    }


    //-:膳食管理
    @PostMapping("/queryFoodManage")
    public ResultVo<FoodManage> queryFoodManage(@RequestBody RequestBodyVo requestBodyVo){
        // 打印接收到的参数
        System.out.println("RequestBodyVo: " + requestBodyVo);
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<FoodManage> pageResponseVo = customerService.queryFoodManage(pageInfoVo,customer);
        return ResultVo.ok(pageResponseVo);
    }

}
