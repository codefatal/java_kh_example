package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice7 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int hangul = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int total = hangul + english + math;
		double avg = total/3;
		if(hangul>=40 && english>=40 && math>=40 && avg>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		sc.close();
	}
}
