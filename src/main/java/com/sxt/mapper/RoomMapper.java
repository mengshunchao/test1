package com.sxt.mapper;

import com.sxt.domain.Room;
import com.sxt.domain.RoomExample;
import com.sxt.vo.RoomVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Integer roomid);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Integer roomid);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    /**
     * 查询所有房间
     * @param roomVo
     * @return
     */
	List<Room> queryAllHotelRooms(RoomVo roomVo);
}