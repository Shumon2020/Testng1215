package com.secondtestng1214;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingCarRental {
	@Test
	public void Booking_eticket_tc1() {
		System.out.println(" My First Holliday Trip tc1");
	}
	@Test(dependsOnMethods= {"Booking_eticket_tc1"})
	public void Booking_eticket_tc2() {
		System.out.println(" My First Holliday Trip tc2");
	}
	@Test(groups= {"Regression"})
	public void Bookingeticket_tc3() {
		System.out.println(" Test case 3");
	}
	@BeforeTest
	public void Beforetestclass() {
		
		System.out.println(" Test this First");
	}
	@Test
	public void Booking_eticket_tc0() {
		System.out.println(" My First Holliday Trip tc5");
	}
	

}
