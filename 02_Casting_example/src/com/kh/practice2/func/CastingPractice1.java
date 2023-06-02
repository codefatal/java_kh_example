package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		int unicode = (int)sc.nextLine().charAt(0);
		System.out.println("unicode : " + unicode);
		sc.close();
	}
}
