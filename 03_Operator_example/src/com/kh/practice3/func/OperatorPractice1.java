package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice1 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
		sc.close();
	}
}
