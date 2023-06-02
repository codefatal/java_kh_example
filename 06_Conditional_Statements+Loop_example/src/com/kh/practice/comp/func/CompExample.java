package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println("양수가 아닙니다.");
		} else {
			for(int i=1; i<=num; i++) {
				if(i%2!=0) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}			
		}
	}
	
	public void practice2() {
		boolean run = true;
		while(run) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num<=0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for(int i=1; i<=num; i++) {
					if(i%2!=0) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				run = false;
			}	
		}
	}
	
	public void practice3() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		
		for(int i=0; i<=str.length()-1;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println(str+" 안에 포함된 "+ch+" 개수 : "+count);
	}
	
	public void practice4() {
		boolean run = true;
		boolean check = true;
		while(run) {
			System.out.print("문자열 : ");
			String str = sc.next();
			System.out.print("문자 : ");
			char ch = sc.next().charAt(0);
			int count = 0;
			
			for(int i=0; i<=str.length()-1;i++) {
				if(str.charAt(i)==ch) {
					count++;
				}
			}
			
			System.out.println(str+" 안에 포함된 "+ch+" 개수 : "+count);
			while(check) {
				System.out.println("더 하시겠습니까? (y/n) : ");
				char conti = sc.next().charAt(0);
				switch(conti) {
				case 'y':
					check = false;
					break;
				case 'n':
					check = false;
					run = false;
					break;
				default:					
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}
	}
	
}
