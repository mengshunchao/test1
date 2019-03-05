package com.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class IndexController {
	
	/**
	 * 跳转到酒店管理页面
	 */
	@RequestMapping("toHotel")
	public String toHotel() {
		return "hotel";
	}
	

}
