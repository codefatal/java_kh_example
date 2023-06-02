package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice3 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
		sc.close();
	}
}
