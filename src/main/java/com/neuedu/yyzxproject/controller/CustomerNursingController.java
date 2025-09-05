package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.Nurselevel;
import com.neuedu.yyzxproject.service.CustomerNursingService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.PageInfoVo;
import com.neuedu.yyzxproject.vo.PageResponseVo;
import com.neuedu.yyzxproject.vo.RequestBodyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerNursing")
public class CustomerNursingController {
    @Autowired
    private CustomerNursingService customerNursingService;
    //-:显示客户信息列表，并通过客户姓名模糊查询
    @PostMapping("/queryAllCustomerInfo")
    public ResultVo<Customer> queryAllCustomerInfo(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<Customer> pageResponseVo = customerNursingService.queryAllCustomerInfo(pageInfoVo,customer);
        return ResultVo.ok(pageResponseVo);
    }
    //-:移除用户的护理级别
    @PostMapping("/deleteCustomerNursingLevel")
    public ResultVo deleteCustomerNursingLevel(@RequestBody Customer customer){
        int num = customerNursingService.deleteCustomerNursingLevel(customer);
        if(num>0){
            return ResultVo.ok("移除成功");
        }else{
            return ResultVo.fail("移除失败");
        }
    }
    //-:客户护理级别配置
    @PostMapping("/allocationCustomerNursingLevel")
    public ResultVo allocationCustomerNursingLevel(@RequestBody RequestBodyVo requestBodyVo){
        Customer customer = requestBodyVo.getCustomer();
        Nurselevel nurselevel = requestBodyVo.getNurselevel();
        int num = customerNursingService.allocationCustomerNursingLevel(customer,nurselevel);
        if(num>0){
            return ResultVo.ok("配置成功");
        }else{
            return ResultVo.fail("配置失败");
        }
    }
}
