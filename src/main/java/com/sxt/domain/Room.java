package com.sxt.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Room implements Serializable {
    private Integer roomid;

    private Integer type;

    private Double price;

    private String info;

    private Integer hotelid;

    private static final long serialVersionUID = 1L;
    
    //添加表格外的数据
    private String name;
    private String typename;
    private String address;
    private String mobile;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Room other = (Room) that;
        return (this.getRoomid() == null ? other.getRoomid() == null : this.getRoomid().equals(other.getRoomid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomid() == null) ? 0 : getRoomid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomid=").append(roomid);
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", info=").append(info);
        sb.append(", hotelid=").append(hotelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}