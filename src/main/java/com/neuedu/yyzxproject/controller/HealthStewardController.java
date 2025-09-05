package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.User;
import com.neuedu.yyzxproject.service.HealthStewardService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import com.neuedu.yyzxproject.vo.PageInfoVo;
import com.neuedu.yyzxproject.vo.PageResponseVo;
import com.neuedu.yyzxproject.vo.RequestBodyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("healthSteward")
public class HealthStewardController {
    @Autowired
    private HealthStewardService healthStewardService;

    //-:查询健康管家列表
    @PostMapping("/queryHealthSteward")
    public ResultVo<User> queryHealthSteward(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        User user = requestBodyVo.getUser();
        PageResponseVo<User> userPageResponseVo = healthStewardService.queryHealthSteward(pageInfoVo,user);
        return ResultVo.ok(userPageResponseVo);
    }

    //-:查询无健康管家的客户信息
    @PostMapping("/queryCustomerWithoutSteward")
    public ResultVo<Customer> queryCustomerWithoutSteward(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<Customer> customerPageResponseVo = healthStewardService.queryCustomerWithoutSteward(pageInfoVo,customer);
        return ResultVo.ok(customerPageResponseVo);
    }

    //-:通过健康管家id查询服务客户
    @PostMapping("/queryServingCustomerById")
    public ResultVo<CustomerNursingRecords> queryServingCustomerById(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        User user = requestBodyVo.getUser();
        PageResponseVo<CustomerNursingRecords> userPageResponseVo = healthStewardService.queryServingCustomerById(pageInfoVo,user);
        return ResultVo.ok(userPageResponseVo);
    }

    //-:删除健康管家的服务对象
    @PostMapping("/deleteServingCustomer")
    public ResultVo deleteServingCustomer(Integer id){
        int num = healthStewardService.deleteServingCustomer(id);
        if(num > 0){
            return ResultVo.ok("删除成功");
        }else{
            return ResultVo.fail("删除失败");
        }
    }
}
