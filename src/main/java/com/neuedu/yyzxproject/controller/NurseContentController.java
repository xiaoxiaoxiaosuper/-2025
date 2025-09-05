package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Nursecontent;
import com.neuedu.yyzxproject.pojo.Nurselevel;
import com.neuedu.yyzxproject.pojo.User;
import com.neuedu.yyzxproject.service.NurseContentService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.PageInfoVo;
import com.neuedu.yyzxproject.vo.PageResponseVo;
import com.neuedu.yyzxproject.vo.RequestBodyVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "护理管理")
@RequestMapping("/nursecontent")
public class NurseContentController {
    @Autowired
    private NurseContentService nurseContentService;
    //-:显示护理项目列表，并根据项目名称模糊查询
    @PostMapping("/queryAllNurseContentInfo")
    public ResultVo<Nursecontent> queryAllNurseContentInfo(@RequestBody RequestBodyVo requestBodyVo) {
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Nursecontent nursecontent = requestBodyVo.getNursecontent();
        PageResponseVo<Nursecontent> pageResponseVo = nurseContentService.queryAllNurseContentInfo(pageInfoVo,nursecontent);
        return ResultVo.ok(pageResponseVo);
    }
    //-:添加护理项目
    @PostMapping("/addNurseContent")
    public ResultVo addNurseContent(@RequestBody Nursecontent nursecontent){
        int num = nurseContentService.addNurseContent(nursecontent);
        if(num>0){
            return ResultVo.ok("添加成功");
        }else{
            return ResultVo.fail("添加失败");
        }
    }
    //-:编辑护理项目
    @PostMapping("/updateNurseContent")
    public ResultVo updateNurseContent(@RequestBody Nursecontent nursecontent){
        int num = nurseContentService.updateNurseContent(nursecontent);
        if(num>0){
            return ResultVo.ok("编辑成功");
        }else{
            return ResultVo.fail("编辑失败");
        }
    }
    //-:删除护理项目
    @PostMapping("/deleteNurseContent")
    public ResultVo deleteNurseContent(@RequestBody Nursecontent nursecontent){
        int num = nurseContentService.deleteNurseContent(nursecontent);
        if(num>0){
            return ResultVo.ok("删除成功");
        }else{
            return ResultVo.fail("删除失败");
        }
    }
}
