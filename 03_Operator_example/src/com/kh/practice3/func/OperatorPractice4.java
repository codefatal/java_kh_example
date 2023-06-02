package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice4 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy/people));
		System.out.println("남는 사탕 개수 : " + (candy%people));
		sc.close();
	}
}
