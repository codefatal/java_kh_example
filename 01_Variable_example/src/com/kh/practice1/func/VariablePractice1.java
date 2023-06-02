package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력해주세요(남/여) : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력해주세요(cm) : ");
		double height = sc.nextDouble();
		System.out.println("키 " + height + "cm 인 " + age + "살 " + gender + " " + name + "님 반갑습니다.");
		System.out.println("====================");
		sc.close();
	}
	
}
