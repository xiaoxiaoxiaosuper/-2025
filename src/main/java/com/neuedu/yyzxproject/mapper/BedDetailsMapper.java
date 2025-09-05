package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.BedDetails;
import com.neuedu.yyzxproject.vo.BedDetailsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BedDetailsMapper {
    public List<BedDetailsVo> queryBedInfo(BedDetailsVo bedDetailsVo);

    // 1. 将 customer_id 对应的数据的 is_deleted 设置为 1
    void updateIsDeleted(@Param("customerId") Integer customerId);

    // 2. 将 bed 表中 bed_id 对应的数据的 bed_status 设置为 1
    void updateBedStatus(@Param("bedId") Integer bedId);

    // 3. 查询 bed_no
    String selectBedNoById(@Param("bedId") Integer bedId);

    // 5. 插入数据到 beddetails 表
    int insertBedDetails(BedDetails bedDetails);

    void updateOldBedId(Integer oldBedId);

    int reviseBedInfo(BedDetails bedDetails);
}
