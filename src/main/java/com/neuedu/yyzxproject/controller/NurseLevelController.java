package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Nursecontent;
import com.neuedu.yyzxproject.pojo.Nurselevel;
import com.neuedu.yyzxproject.service.NurseLevelService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.PageInfoVo;
import com.neuedu.yyzxproject.vo.PageResponseVo;
import com.neuedu.yyzxproject.vo.RequestBodyVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "护理管理")
@RequestMapping("/nurselevel")
public class NurseLevelController {

    @Autowired
    private NurseLevelService nurseLevelService;

    //-:显示护理级别列表
    @PostMapping("/findNurselevel")
    public ResultVo<Nurselevel> findNurselevel(@RequestBody RequestBodyVo requestBodyVo) {
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        PageResponseVo<Nurselevel> pageResponseVo = nurseLevelService.findNurselevel(pageInfoVo);
        return ResultVo.ok(pageResponseVo);
    }
    //-:添加护理级别
    @PostMapping("/addNurselevel")
    public ResultVo addNurselevel(@RequestBody Nurselevel nurselevel){
        int num = nurseLevelService.addNurselevel(nurselevel);
        if(num>0){
            return ResultVo.ok("添加成功");
        }else{
            return ResultVo.fail("添加失败");
        }
    }
    //-:修改护理级别状态 1启用 2停用
    @PostMapping("modifyNurselevelStatus")
    public ResultVo modifyNurselevelStatus(@RequestBody Nurselevel nurselevel){
        int num = nurseLevelService.modifyNurselevelStatus(nurselevel);
        if(num>0){
            return ResultVo.ok("修改成功");
        }else{
            return ResultVo.fail("修改失败");
        }
    }
    //-:显示护理项目,并根据护理项目名称模糊查询
    @PostMapping("/queryNursingProject")
    public ResultVo<Nursecontent> queryNursingProject(@RequestBody RequestBodyVo requestBodyVo) {
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Nursecontent nursecontent = requestBodyVo.getNursecontent();
        PageResponseVo<Nursecontent> pageResponseVo = nurseLevelService.queryNursingProject(pageInfoVo,nursecontent);
        return ResultVo.ok(pageResponseVo);
    }
    //-:根据护理级别显示对应的护理项目名称
    @PostMapping("/queryNursingProjectByLevel")
    public ResultVo<Nursecontent> queryNursingProjectByLevel(@RequestBody RequestBodyVo requestBodyVo){
        PageInfoVo pageInfoVo = requestBodyVo.getPageInfoVo();
        Nurselevel nurselevel = requestBodyVo.getNurselevel();
        PageResponseVo<Nursecontent> pageResponseVo = nurseLevelService.queryNursingProjectByLevel(pageInfoVo,nurselevel);
        return ResultVo.ok(pageResponseVo);
    }
    //-:删除某护理级别下的某项护理项目
    @PostMapping("/delectProjectInLevel")
    public ResultVo deleteProjectInLevel(@RequestParam Integer levelId, @RequestParam Integer itemId) {
        int num = nurseLevelService.deleteProjectInLevel(levelId, itemId);
        return num > 0 ? ResultVo.ok("删除成功") : ResultVo.fail("删除失败");
    }
}
