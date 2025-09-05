package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.BackDown;
import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.service.BackdownService;
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
@RequestMapping("/backdown")
public class BackDownController {
    @Autowired
    private BackdownService backdownService;
    //-:出院登记-显示客户信息
    //nursing-records-controller  /api/nursingrecords/queryCustomerInfo

    //-:显示出院登记信息
    @PostMapping("/queryAllBackdownInfo")
    public ResultVo queryAllBackdownInfo(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        PageResponseVo<BackDown> backDowns = backdownService.queryAllBackdownInfo(pageInfoVo);
        return ResultVo.ok(backDowns);
    }

}
