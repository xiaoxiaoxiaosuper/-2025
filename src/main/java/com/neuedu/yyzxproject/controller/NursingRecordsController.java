package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.pojo.NurseRecord;
import com.neuedu.yyzxproject.service.NursingRecordsService;
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
@RequestMapping("/nursingrecords")
public class NursingRecordsController {
    @Autowired
    private NursingRecordsService nursingrecordsService;
    //-:查询客户信息
    @PostMapping("/queryCustomerInfo")
    public ResultVo<CustomerNursingRecords> queryCustomerInfo(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<CustomerNursingRecords> userPageResponseVo = nursingrecordsService.queryCustomerInfo(pageInfoVo,customer);
        return ResultVo.ok(userPageResponseVo);
    }
    //-:查询护理记录
    @PostMapping("/queryNursingRecords")
    public ResultVo<NurseRecord> queryNursingRecords(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Customer customer = requestBodyVo.getCustomer();
        PageResponseVo<NurseRecord> userPageResponseVo = nursingrecordsService.queryNursingRecords(pageInfoVo,customer);
        return ResultVo.ok(userPageResponseVo);
    }
    //-:移除护理记录
    @PostMapping("/deleteNursingRecordsById")
    public ResultVo deleteNursingRecordsById(Integer nursingRecordsId){
        int num = nursingrecordsService.deleteNursingRecordsById(nursingRecordsId);
        if(num>0){
            return ResultVo.ok("移除成功");
        }else{
            return ResultVo.fail("移除失败");
        }
    }
}
