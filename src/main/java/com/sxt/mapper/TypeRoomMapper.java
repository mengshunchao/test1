package com.sxt.mapper;

import com.sxt.domain.TypeRoom;
import com.sxt.domain.TypeRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeRoomMapper {
    long countByExample(TypeRoomExample example);

    int deleteByExample(TypeRoomExample example);

    int insert(TypeRoom record);

    int insertSelective(TypeRoom record);

    List<TypeRoom> selectByExample(TypeRoomExample example);

    int updateByExampleSelective(@Param("record") TypeRoom record, @Param("example") TypeRoomExample example);

    int updateByExample(@Param("record") TypeRoom record, @Param("example") TypeRoomExample example);
}