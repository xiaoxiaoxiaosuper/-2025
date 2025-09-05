package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Nursecontent;
import com.neuedu.yyzxproject.pojo.Nurselevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NurseLevelMapper {
    List<Nurselevel> findNurselevel();

    int addNurselevel(Nurselevel nurselevel);

    int modifyNurselevelStatus(Nurselevel nurselevel);

    List<Nursecontent> queryNursingProject(Nursecontent nursecontent);

    List<Nursecontent> queryNursingProjectByLevel(Nurselevel nurselevel);

    int deleteProjectInLevel(@Param("levelId") Integer levelId, @Param("itemId") Integer itemId);
}
