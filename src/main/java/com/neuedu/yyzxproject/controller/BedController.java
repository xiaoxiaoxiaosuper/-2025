package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.pojo.Bed;
import com.neuedu.yyzxproject.service.BedService;
import com.neuedu.yyzxproject.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bed")
public class BedController {
    @Autowired
    private BedService bedService;

    @GetMapping("/queryKxcwByRoomNo")
    public ResultVo queryKxcwByRoomNo(String roomNo) {
        List<Bed> beds = bedService.queryKxcwByRoomNo(roomNo);
        return ResultVo.ok(beds);
    }
}
