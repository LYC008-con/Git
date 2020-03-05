package com.cy.pj.vo.hlj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private Integer item_id;
	private String order_num;
	private Date check_in_time;
	private Date create_time;
	private Date check_out_time;
	private Integer house_number;
	private String real_name;
	private String idcord;
	private String tel;
	private Integer guest_num;
	private String real_name1;
	private String idcord1;
	private Double gross_price;
	private Integer landlord_id;
	private Integer guest_id;
	private Integer house_id;
	private Integer member_id;
	
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getHouse_id() {
		return house_id;
	}
	public void setHouse_id(Integer house_id) {
		this.house_id = house_id;
	}
	public Integer getLandlord_id() {
		return landlord_id;
	}
	public void setLandlord_id(Integer landlord_id) {
		this.landlord_id = landlord_id;
	}
	public Integer getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(Integer guest_id) {
		this.guest_id = guest_id;
	}
	public String getOrder_num() {
		return order_num;
	}
	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public Date getCheck_in_time() {
		return check_in_time;
	}
	public void setCheck_in_time(String check_in_time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(check_in_time);
			this.check_in_time = date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getCheck_out_time() {
		return check_out_time;
	}
	public void setcheck_out_time(String check_out_time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(check_out_time);
			this.check_out_time = date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Integer getHouse_number() {
		return house_number;
	}
	public void setHouse_number(Integer house_number) {
		this.house_number = house_number;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getIdcord() {
		return idcord;
	}
	public void setIdcord(String idcord) {
		this.idcord = idcord;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getGuest_num() {
		return guest_num;
	}
	public void setGuest_num(Integer guest_num) {
		this.guest_num = guest_num;
	}
	public String getReal_name1() {
		return real_name1;
	}
	public void setReal_name1(String real_name1) {
		this.real_name1 = real_name1;
	}
	public String getIdcord1() {
		return idcord1;
	}
	public void setIdcord1(String idcord1) {
		this.idcord1 = idcord1;
	}
	public Double getGross_price() {
		return gross_price;
	}
	public void setGross_price(Double gross_price) {
		this.gross_price = gross_price;
	}
	@Override
	public String toString() {
		return "Order [item_id=" + item_id + ", check_in_time=" + check_in_time + ", check_out_time=" + check_out_time
				+ ", house_number=" + house_number + ", real_name=" + real_name + ", idcord=" + idcord + ", tel=" + tel
				+ ", guest_num=" + guest_num + ", real_name1=" + real_name1 + ", idcord1=" + idcord1 + ", gross_price="
				+ gross_price + "]";
	}
	public Order(Integer item_id, Date check_in_time, Date check_out_time, Integer house_number, String real_name,
			String idcord, String tel, Integer guest_num, String real_name1, String idcord1, Double gross_price) {
		super();
		this.item_id = item_id;
		this.check_in_time = check_in_time;
		check_out_time = check_out_time;
		this.house_number = house_number;
		this.real_name = real_name;
		this.idcord = idcord;
		this.tel = tel;
		this.guest_num = guest_num;
		this.real_name1 = real_name1;
		this.idcord1 = idcord1;
		this.gross_price = gross_price;
	}
	public Order() {
		super();
	}
	
}
