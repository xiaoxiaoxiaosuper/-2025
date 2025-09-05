package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Bed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface BedMapper {
    public List<Bed> queryKxcwByRoomNo(@Param("roomNo") String roomNo);
}
