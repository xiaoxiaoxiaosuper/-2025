package com.neuedu.yyzxproject.service;

import com.neuedu.yyzxproject.pojo.BackDown;
import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import com.neuedu.yyzxproject.vo.PageInfoVo;
import com.neuedu.yyzxproject.vo.PageResponseVo;

public interface BackdownService {
    public PageResponseVo<BackDown> queryAllBackdownInfo(PageInfoVo pageInfoVo);

}
