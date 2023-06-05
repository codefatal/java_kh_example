package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		try {
			if((num1>=0 && num1<=100) && (num2>=0 && num2<=100)) {
				nc.checkDouble(num1, num2);
			} else {				
				throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
			}
		} catch(NumRangeException e) {
			e.printStackTrace();
		}
	}
}
