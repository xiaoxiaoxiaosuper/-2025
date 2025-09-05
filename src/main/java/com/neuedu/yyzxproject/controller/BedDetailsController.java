package com.neuedu.yyzxproject.controller;


import com.neuedu.yyzxproject.pojo.BedDetails;
import com.neuedu.yyzxproject.service.BedDetailsService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.BedDetailsVo;
import com.neuedu.yyzxproject.vo.PageInfoVo;
import com.neuedu.yyzxproject.vo.PageResponseVo;
import com.neuedu.yyzxproject.vo.RequestBodyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bedDetails")
public class BedDetailsController {
    @Autowired
    private BedDetailsService bedDetailsService;
    //-:查询床位的详细信息
    @PostMapping("/queryBedInfo")
    public ResultVo queryBedInfo(@RequestBody RequestBodyVo requestBodyVo){
        System.out.println(requestBodyVo);
        //-:查看传递过来的分页信息：
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        //-:获取页面传递的查询条件
        BedDetailsVo bedDetailsVo = requestBodyVo.getBedDetailsVo();
        PageResponseVo<BedDetailsVo> pageResponseVo = bedDetailsService.queryBedInfo(pageInfoVo,bedDetailsVo);
        return ResultVo.ok(pageResponseVo);
    }
    //-:进行床位调换
    @PostMapping("/exchangeBedInfo")
    public void exchangeBedInfo(@RequestBody BedDetails bedDetails){
        int num = bedDetailsService.exchangeBedInfo(bedDetails);
        if(num>0){
            ResultVo.ok("调换成功");
        }else{
            ResultVo.fail("调换失败");
        }
    }
    //-:修改床位使用日期
    @PostMapping("/reviseBedInfo")
    public void reviseBedInfo(@RequestBody BedDetails bedDetails){
        int num = bedDetailsService.reviseBedInfo(bedDetails);
        if(num>0){
            ResultVo.ok("修改成功");
        }else{
            ResultVo.fail("修改失败");
        }
    }
}
