package com.phase2.project.FlyAway;

public class FlightDetails {
private String flightNo,departureLocation,arrivalLocation,flightTime,flightDate,seatAvl,flightClass;
double fare,flightDur;
public FlightDetails(String flightNo, String departureLocation, String arrivalLocation, String flightTime,
		String flightDate, String seatAvl, String flightClass, double fare, double flightDur) {
	super();
	this.flightNo = flightNo;
	this.departureLocation = departureLocation;
	this.arrivalLocation = arrivalLocation;
	this.flightTime = flightTime;
	this.flightDate = flightDate;
	this.seatAvl = seatAvl;
	this.flightClass = flightClass;
	this.fare = fare;
	this.flightDur = flightDur;
}
public FlightDetails(String flightTime2, String departureLocation2, String arrivalLocation2, String flightTime3,
		String flightDate2, double flightDur2, double fare2, String flightClass2, String seatAvl2) {
	// TODO Auto-generated constructor stub
}
public String getFlightNo() {
	return flightNo;
}
public void setFlightNo(String flightNo) {
	this.flightNo = flightNo;
}
public String getDepartureLocation() {
	return departureLocation;
}
public void setDepartureLocation(String departureLocation) {
	this.departureLocation = departureLocation;
}
public String getArrivalLocation() {
	return arrivalLocation;
}
public void setArrivalLocation(String arrivalLocation) {
	this.arrivalLocation = arrivalLocation;
}
public String getFlightTime() {
	return flightTime;
}
public void setFlightTime(String flightTime) {
	this.flightTime = flightTime;
}
public String getFlightDate() {
	return flightDate;
}
public void setFlightDate(String flightDate) {
	this.flightDate = flightDate;
}
public String getSeatAvl() {
	return seatAvl;
}
public void setSeatAvl(String seatAvl) {
	this.seatAvl = seatAvl;
}
public String getFlightClass() {
	return flightClass;
}
public void setFlightClass(String flightClass) {
	this.flightClass = flightClass;
}
public double getFare() {
	return fare;
}
public void setFare(double fare) {
	this.fare = fare;
}
public double getFlightDur() {
	return flightDur;
}
public void setFlightDur(double flightDur) {
	this.flightDur = flightDur;
}
	
}
