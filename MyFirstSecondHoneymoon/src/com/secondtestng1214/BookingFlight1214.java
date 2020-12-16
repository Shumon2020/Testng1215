package com.secondtestng1214;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingFlight1214 {
	@Test
	public void Booking_DepartureCity_tc1() {
		System.out.println(" My Departure city tc1");
	}
	@Test(groups= {"Regression"})
	public void Booking_Flight_Timetc2() {
		System.out.println(" My Time to take the flight tc2");
	}
	@Test
	public void Booking_Duration_Flighttimetc3() {
		System.out.println(" Test case 3");
	}
	@BeforeTest
	public void Beforetestclass() {
		
		System.out.println(" Test this First");
	}
	@Test
	public void Booking_Arrival_Time_tc0() {
		System.out.println(" My ETA Time of Arrival Trip tc5");
	}
	

}
