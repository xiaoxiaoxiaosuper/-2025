package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.BackDown;
import com.neuedu.yyzxproject.pojo.OutWard;
import com.neuedu.yyzxproject.service.OutWardService;
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
@RequestMapping("/outward")
public class OutWardController {
    @Autowired
    private OutWardService outWardService;
    //-:显示外出信息
    @PostMapping("/queryAllOutwardInfo")
    public ResultVo queryAllOutwardInfo(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        PageResponseVo<OutWard> outWardPageResponseVo = outWardService.queryAllOutwardInfo(pageInfoVo);
        return ResultVo.ok(outWardPageResponseVo);
    }
    //-:审批 同意 auditstatus = 1  拒绝 auditstatus = 2
    @PostMapping("/approval")
    public ResultVo approval(@RequestBody OutWard outWard){
        int num = outWardService.approval(outWard);
        if(num>0){
            return ResultVo.ok("审批成功");
        }else {
            return ResultVo.fail("审批失败");
        }
    }
}
