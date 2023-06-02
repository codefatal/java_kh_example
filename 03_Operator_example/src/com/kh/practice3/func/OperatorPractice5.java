package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice5 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int room = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		if(gender == 'M') {
			System.out.println(grade + "학년 " + room + "반 " + num + "번 " + name + " 남학생의 성적은 " + score + "이다.");
		} else {
			System.out.println(grade + "학년 " + room + "반 " + num + "번 " + name + " 여학생의 성적은 " + score + "이다.");
		}
		sc.close();
	}
}
