package com.sxt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sxt.service.RoomService;
import com.sxt.vo.DataGridView;
import com.sxt.vo.RoomVo;

@Controller
@RequestMapping("hotel")
public class HotelController {
	
	@Autowired
	private RoomService roomService;
	
	/**
	 * 加载表格数据
	 */
	@RequestMapping("loadAllHotels")
	@ResponseBody
	public DataGridView loadAllHotels(RoomVo roomVo) {
		return this.roomService.queryAllHotelRoom(roomVo);
	}
	/**
	 * 添加房间/SpringBoot-1/hotel/addHotel
	 * 
	 */
	@RequestMapping("addHotel")
	@ResponseBody
	public Map<String,Integer> addHotel(RoomVo roomVo){
		Map<String,Integer> map = new HashMap<String, Integer>();
		try {
			this.roomService.addHotelRoom(roomVo);
			map.put("code", 200);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("code", 500);
		}
		return map;
	}
	/**
	 * 删除酒店房间
	 * 
	 */
	@RequestMapping("deleteHotel")
	@ResponseBody
	public Map<String,Object> deleteHotel(RoomVo roomlVo){
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			this.roomService.deleteHotelRoom(roomlVo);
			map.put("msg", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("msg", "删除失败");
		}
		return map;
	}

}
