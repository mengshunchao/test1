package com.sxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sxt.domain.Room;
import com.sxt.mapper.RoomMapper;
import com.sxt.service.RoomService;
import com.sxt.vo.DataGridView;
import com.sxt.vo.RoomVo;


@Service
@Transactional(propagation=Propagation.REQUIRED)
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomMapper roomMapper;
	
	/**
	 * 加载所有房间数据
	 */
	@Override
	public DataGridView queryAllHotelRoom(RoomVo roomVo) {
		Page<Object> page = PageHelper.startPage(roomVo.getPage(), roomVo.getLimit());
		List<Room> list = this.roomMapper.queryAllHotelRooms(roomVo);
		return new DataGridView(page.getTotal(),list);
	}
	/**
	 * 添加房间
	 * 
	 */
	@Override
	public void addHotelRoom(RoomVo roomVo) {
		this.roomMapper.insertSelective(roomVo);
	}
	/**
	 * 删除房间
	 * 
	 */
	@Override
	public void deleteHotelRoom(RoomVo roomlVo) {
		this.roomMapper.deleteByPrimaryKey(roomlVo.getRoomid());
	}

}
