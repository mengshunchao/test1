package com.sxt.service;

import com.sxt.vo.DataGridView;
import com.sxt.vo.RoomVo;

public interface RoomService {
	
	/**
	 * 查询所有酒店所有房间
	 */
	DataGridView queryAllHotelRoom(RoomVo roomVo);
	/**
	 * 添加房间
	 * 
	 */
	void addHotelRoom(RoomVo roomVo);
	/**
	 * 删除房间
	 * 
	 */
	void deleteHotelRoom(RoomVo roomlVo);

}
