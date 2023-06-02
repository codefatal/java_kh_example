package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double hangul = sc.nextDouble();
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		int total = (int)(hangul + english + math);
		int avg = total/3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		sc.close();
	}
}
