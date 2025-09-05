package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Bed;
import com.neuedu.yyzxproject.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface RoomMapper {
    //-:通过楼层查询对应的房间
    public List<Room> queryRoomsByFloor(@Param("floor") String floor);
    //-:通过房间查询对应的床位
    public List<Bed> queryBedsByRoomNo(@Param("roomNo") String roomNo);
}
