package com.neuedu.yyzxproject.controller;

import com.neuedu.yyzxproject.service.UserService;
import com.neuedu.yyzxproject.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户管理")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录请求
     */
    //@ApiOperation("用户登录接口")
    ///@GetMapping("/login")
    //public ResultVo login(String username, String password) {
    //    return userService.login(username, password);
    }
//}
