package com.cy.pj.vo.zsm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class house_xq {

	private Integer houseid;
	
	private String harea;
	
	private String province;
	
	private String hproper;
	
	private String housecity;
	
	private String streetaddress;
	
	private String houseaddress;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")  
	private Date houseTime;
	
	private String additionalexplanation;
	
	private String rentalmode;
	
	private String houseclass;
	
	private Integer floorspace;
	
	private String ambitus;
	
	private String housetype;
	
	private String housename;
	
	private String housefeature;
	
	private String position;
	
	private String peripheralintroduction;
	
	private String picturepath;
	
	private Double baseprice;
	
	private Integer minday;

	private String equipment;
	
	private String sanitarysquipment;
	
	private String kitchenequipment;
	
	private String entertainmentequipment;
	
	private String safetyequipment;
	
	private Integer landlordid;
	
	private String buildingequipment;
	
	private String peripheralequipment;
	
	private String otherservices;
	


	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getSanitarysquipment() {
		return sanitarysquipment;
	}

	public void setSanitarysquipment(String sanitarysquipment) {
		this.sanitarysquipment = sanitarysquipment;
	}

	public String getKitchenequipment() {
		return kitchenequipment;
	}

	public void setKitchenequipment(String kitchenequipment) {
		this.kitchenequipment = kitchenequipment;
	}

	public String getEntertainmentequipment() {
		return entertainmentequipment;
	}

	public void setEntertainmentequipment(String entertainmentequipment) {
		this.entertainmentequipment = entertainmentequipment;
	}

	public String getSafetyequipment() {
		return safetyequipment;
	}

	public void setSafetyequipment(String safetyequipment) {
		this.safetyequipment = safetyequipment;
	}

	public String getBuildingequipment() {
		return buildingequipment;
	}

	public void setBuildingequipment(String buildingequipment) {
		this.buildingequipment = buildingequipment;
	}

	public String getPeripheralequipment() {
		return peripheralequipment;
	}

	public void setPeripheralequipment(String peripheralequipment) {
		this.peripheralequipment = peripheralequipment;
	}

	public String getOtherservices() {
		return otherservices;
	}

	public void setOtherservices(String otherservices) {
		this.otherservices = otherservices;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public String getHarea() {
		return harea;
	}

	public void setHarea(String harea) {
		this.harea = harea;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getHproper() {
		return hproper;
	}

	public void setHproper(String hproper) {
		this.hproper = hproper;
	}

	public String getHousecity() {
		return housecity;
	}

	public void setHousecity(String housecity) {
		this.housecity = housecity;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getHouseaddress() {
		return houseaddress;
	}

	public void setHouseaddress(String houseaddress) {
		this.houseaddress = houseaddress;
	}

	public Date getHouseTime() {
		return houseTime;
	}

	public void setHouseTime(Date houseTime) {
		this.houseTime = houseTime;
	}

	public String getAdditionalexplanation() {
		return additionalexplanation;
	}

	public void setAdditionalexplanation(String additionalexplanation) {
		this.additionalexplanation = additionalexplanation;
	}

	public String getRentalmode() {
		return rentalmode;
	}

	public void setRentalmode(String rentalmode) {
		this.rentalmode = rentalmode;
	}

	public String getHouseclass() {
		return houseclass;
	}

	public void setHouseclass(String houseclass) {
		this.houseclass = houseclass;
	}

	public Integer getFloorspace() {
		return floorspace;
	}

	public void setFloorspace(Integer floorspace) {
		this.floorspace = floorspace;
	}

	public String getAmbitus() {
		return ambitus;
	}

	public void setAmbitus(String ambitus) {
		this.ambitus = ambitus;
	}

	public String getHousetype() {
		return housetype;
	}

	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getHousefeature() {
		return housefeature;
	}

	public void setHousefeature(String housefeature) {
		this.housefeature = housefeature;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPeripheralintroduction() {
		return peripheralintroduction;
	}

	public void setPeripheralintroduction(String peripheralintroduction) {
		this.peripheralintroduction = peripheralintroduction;
	}

	public String getPicturepath() {
		return picturepath;
	}

	public void setPicturepath(String picturepath) {
		this.picturepath = picturepath;
	}

	public Double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(Double baseprice) {
		this.baseprice = baseprice;
	}

	public Integer getMinday() {
		return minday;
	}

	public void setMinday(Integer minday) {
		this.minday = minday;
	}



	public house_xq() {
		super();
	}

	public Integer getLandlordid() {
		return landlordid;
	}

	public void setLandlordid(Integer landlordid) {
		this.landlordid = landlordid;
	}

	public house_xq(Integer houseid, String harea, String province, String hproper, String housecity,
			String streetaddress, String houseaddress, Date houseTime, String additionalexplanation, String rentalmode,
			String houseclass, Integer floorspace, String ambitus, String housetype, String housename,
			String housefeature, String position, String peripheralintroduction, String picturepath, Double baseprice,
			Integer minday, String equipment, String sanitarysquipment, String kitchenequipment,
			String entertainmentequipment, String safetyequipment, Integer landlordid, String buildingequipment,
			String peripheralequipment, String otherservices) {
		super();
		this.houseid = houseid;
		this.harea = harea;
		this.province = province;
		this.hproper = hproper;
		this.housecity = housecity;
		this.streetaddress = streetaddress;
		this.houseaddress = houseaddress;
		this.houseTime = houseTime;
		this.additionalexplanation = additionalexplanation;
		this.rentalmode = rentalmode;
		this.houseclass = houseclass;
		this.floorspace = floorspace;
		this.ambitus = ambitus;
		this.housetype = housetype;
		this.housename = housename;
		this.housefeature = housefeature;
		this.position = position;
		this.peripheralintroduction = peripheralintroduction;
		this.picturepath = picturepath;
		this.baseprice = baseprice;
		this.minday = minday;
		this.equipment = equipment;
		this.sanitarysquipment = sanitarysquipment;
		this.kitchenequipment = kitchenequipment;
		this.entertainmentequipment = entertainmentequipment;
		this.safetyequipment = safetyequipment;
		this.landlordid = landlordid;
		this.buildingequipment = buildingequipment;
		this.peripheralequipment = peripheralequipment;
		this.otherservices = otherservices;
	}

	@Override
	public String toString() {
		return "house_xq [houseid=" + houseid + ", harea=" + harea + ", province=" + province + ", hproper=" + hproper
				+ ", housecity=" + housecity + ", streetaddress=" + streetaddress + ", houseaddress=" + houseaddress
				+ ", houseTime=" + houseTime + ", additionalexplanation=" + additionalexplanation + ", rentalmode="
				+ rentalmode + ", houseclass=" + houseclass + ", floorspace=" + floorspace + ", ambitus=" + ambitus
				+ ", housetype=" + housetype + ", housename=" + housename + ", housefeature=" + housefeature
				+ ", position=" + position + ", peripheralintroduction=" + peripheralintroduction + ", picturepath="
				+ picturepath + ", baseprice=" + baseprice + ", minday=" + minday + ", equipment=" + equipment
				+ ", sanitarysquipment=" + sanitarysquipment + ", kitchenequipment=" + kitchenequipment
				+ ", entertainmentequipment=" + entertainmentequipment + ", safetyequipment=" + safetyequipment
				+ ", landlordid=" + landlordid + ", buildingequipment=" + buildingequipment + ", peripheralequipment="
				+ peripheralequipment + ", otherservices=" + otherservices + "]";
	}


	
	
		
}
