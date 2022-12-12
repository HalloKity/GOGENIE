package com.kt.rookie.model.vo;

public class ReservationVO {
	private String reservationId;
	private String reserveDate;
	private String stationId;
	private String busId;
	
	public ReservationVO() {
		super();
	}

	public ReservationVO(String reservationId, String reserveDate, String stationId, String busId) {
		super();
		this.reservationId = reservationId;
		this.reserveDate = reserveDate;
		this.stationId = stationId;
		this.busId = busId;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	@Override
	public String toString() {
		return "ReservationVO [reservationId=" + reservationId + ", reserveDate=" + reserveDate + ", stationId="
				+ stationId + ", busId=" + busId + "]";
	}
	
}
