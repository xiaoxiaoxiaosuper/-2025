package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.BackDown;
import com.neuedu.yyzxproject.pojo.Customer;
import com.neuedu.yyzxproject.vo.CustomerNursingRecords;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackdownMapper {
    public List<BackDown> queryAllBackdownInfo();

}
