package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void Method() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================");
		System.out.print("가로 : ");
		double height = sc.nextDouble();
		System.out.print("세로 : ");
		double width = sc.nextDouble();
		double area = height * width;
		double round = (height + width) * 2;
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
		System.out.println("====================");
		sc.close();
	}
}
