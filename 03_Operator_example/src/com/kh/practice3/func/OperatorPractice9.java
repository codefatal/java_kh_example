package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice9 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		if(num1 < num2) {
			System.out.print("입력 : ");
			int input = sc.nextInt();
			if(input <= num1 || input > num2) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println("정수1이 정수2보다 큽니다.");
		}
		sc.close();
	}
}
