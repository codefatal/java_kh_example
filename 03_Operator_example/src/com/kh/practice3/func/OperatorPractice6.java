package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice6 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age >= 14 && age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		sc.close();
	}
}
