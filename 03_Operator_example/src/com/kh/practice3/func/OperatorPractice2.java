package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice2 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			System.out.println("양수다.");
		} else if(num == 0) {
			System.out.println("0이다.");
		} else {
			System.out.println("음수다.");
		}
		sc.close();
	}
}
