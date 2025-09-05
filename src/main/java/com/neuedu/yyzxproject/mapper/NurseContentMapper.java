package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Nursecontent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NurseContentMapper {
    List<Nursecontent> queryAllNurseContentInfo(Nursecontent nursecontent);

    int addNurseContent(Nursecontent nursecontent);

    int updateNurseContent(Nursecontent nursecontent);

    int deleteNurseContent(Nursecontent nursecontent);
}
