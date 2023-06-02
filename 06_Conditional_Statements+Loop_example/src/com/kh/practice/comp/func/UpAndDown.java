package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	private static Scanner sc = new Scanner(System.in);
	
	public void upDown() {
		Random rd = new Random();
		int answer = rd.nextInt(100)+1;
		boolean run = true;
		int count = 0;
		while(run) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int randomNum = sc.nextInt();
			if(randomNum>100 || randomNum<=0) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			} else if(randomNum==answer) {
				count++;
				run = false;
				System.out.println("정답입니다!!");
			} else if(randomNum>answer) {
				count++;
				System.out.println("Down!");
			} else if(randomNum<answer) {
				count++;
				System.out.println("UP!");
			}
		}
		System.out.println(count+"회 만에 맞추셨습니다.");
	}
}
