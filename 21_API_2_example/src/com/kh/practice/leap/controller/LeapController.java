package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		if(year%4==0 && (year%100!=0 || year%400==0)) {			
			return true;
		} else {
			return false;
		}
	}
	
	public long leapDate(Calendar c) {
		return 0;
	}
}
