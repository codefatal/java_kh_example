package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice8 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String peopleNumber = sc.nextLine();
		System.out.println(peopleNumber.charAt(7));
		if(peopleNumber.charAt(7) == '1' || peopleNumber.charAt(7) == '3') {
			System.out.println("남자");
		} else if(peopleNumber.charAt(7) == '2' || peopleNumber.charAt(7) == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
		sc.close();		
	}
}
