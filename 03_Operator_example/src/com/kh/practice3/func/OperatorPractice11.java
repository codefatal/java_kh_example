package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice11 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int people1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int people2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int people3 = sc.nextInt();
		double insen1 = 1.4;
		double insen2 = 1.0;
		double insen3 = 1.15;
		
		System.out.println("A사원 연봉/연봉+a : " + people1 + "/" + (people1*insen1));
		if(people1*insen1 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("B사원 연봉/연봉+a : " + people2 + "/" + (people2*insen2));
		if(people2*insen2 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("C사원 연봉/연봉+a : " + people3 + "/" + (people3*insen3));
		if(people3*insen3 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		sc.close();
	}
}
