package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.service.RoomService;
import com.neuedu.yyzxproject.utils.ResultVo;
import com.neuedu.yyzxproject.vo.CwsyBedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    //-查询床位的示意图
    @GetMapping("/findCwsyBedVo")
    public ResultVo<CwsyBedVo> findCwsyBedVo(String floor){
        return roomService.findCwsyBedVo(floor);
    }
}