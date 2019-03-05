package com.sxt.vo;

import com.sxt.domain.Room;

public class RoomVo extends Room {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 分页
	private Integer page;
	private Integer limit;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
		 
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
