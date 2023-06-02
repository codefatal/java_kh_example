package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController lc = new LeapController();
	private Scanner sc = new Scanner(System.in);
	
	public LeapView() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		System.out.print("년도를 입력해주세요 : ");
		int year = sc.nextInt();
		if(lc.isLeapYear(year)==true) {
			System.out.println(year+"년은 윤년 입니다.");
		} else {
			System.out.println(year+"년은 평년 입니다.");			
		}
		c1.set(1, 0, 1);
		c2.set(year, 0, 1);
		long a = c1.getTimeInMillis();
		long b = c2.getTimeInMillis();
		
		System.out.println("총 날짜 수: " + (b-a)/(60*60*1000*24) + "일");
	}
}

