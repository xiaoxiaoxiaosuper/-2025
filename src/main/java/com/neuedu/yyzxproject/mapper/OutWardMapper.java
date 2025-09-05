package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.OutWard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutWardMapper {
    List<OutWard> queryAllOutwardInfo();

    int approval(OutWard outWard);
}
