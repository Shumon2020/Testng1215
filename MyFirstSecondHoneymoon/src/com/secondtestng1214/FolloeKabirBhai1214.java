package com.secondtestng1214;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FolloeKabirBhai1214 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Run This Before Every Test Case");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Run This After Every Test Case");
		
	}
	
	
	
	
	@Test
	public void Booking_eticket_tc1() {
		System.out.println(" My First Holliday Trip tc1");
	}
	@Test(dependsOnMethods= {"Booking_eticket_tc1"})
	public void Booking_eticket_tc2() {
		System.out.println(" My First Holliday Trip tc2");
	}
	@Test
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
	
	@Test
	public void Booking_eticket_tc4() {
		System.out.println(" My First Holliday Trip tc4");
	}
	@AfterTest
	public void Aftertestclass() {
		
		System.out.println(" Test this Last");
	}
	
}

