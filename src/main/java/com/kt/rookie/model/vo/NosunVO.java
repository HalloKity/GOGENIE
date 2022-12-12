package com.kt.rookie.model.vo;

public class NosunVO {
	private String stationId;
	private String commuteId;
	private String busId;
	private String line;
	private String mainPlace;
	private String detailPlace;
	private String departureTime;
	private Double latitude;
	private Double longitude;
	private String carNum;
	private String phone;
	private String officePlace;
	private String officeTime;
	public NosunVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NosunVO(String stationId, String commuteId, String busId, String line, String mainPlace, String detailPlace,
			String departureTime, Double latitude, Double longitude, String carNum, String phone, String officePlace,
			String officeTime) {
		super();
		this.stationId = stationId;
		this.commuteId = commuteId;
		this.busId = busId;
		this.line = line;
		this.mainPlace = mainPlace;
		this.detailPlace = detailPlace;
		this.departureTime = departureTime;
		this.latitude = latitude;
		this.longitude = longitude;
		this.carNum = carNum;
		this.phone = phone;
		this.officePlace = officePlace;
		this.officeTime = officeTime;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getCommuteId() {
		return commuteId;
	}
	public void setCommuteId(String commuteId) {
		this.commuteId = commuteId;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getMainPlace() {
		return mainPlace;
	}
	public void setMainPlace(String mainPlace) {
		this.mainPlace = mainPlace;
	}
	public String getDetailPlace() {
		return detailPlace;
	}
	public void setDetailPlace(String detailPlace) {
		this.detailPlace = detailPlace;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public Double getLatitue() {
		return latitude;
	}
	public void setLatitue(Double latitue) {
		this.latitude = latitue;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOfficePlace() {
		return officePlace;
	}
	public void setOfficePlace(String officePlace) {
		this.officePlace = officePlace;
	}
	public String getOfficeTime() {
		return officeTime;
	}
	public void setOfficeTime(String officeTime) {
		this.officeTime = officeTime;
	}
	@Override
	public String toString() {
		return "NosunVO [stationId=" + stationId + ", commuteId=" + commuteId + ", busId=" + busId + ", line=" + line
				+ ", mainPlace=" + mainPlace + ", detailPlace=" + detailPlace + ", departureTime=" + departureTime
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", carNum=" + carNum + ", phone=" + phone
				+ ", officePlace=" + officePlace + ", officeTime=" + officeTime + "]";
	}
	
	
	
}
