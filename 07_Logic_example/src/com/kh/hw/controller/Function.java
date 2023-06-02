package com.kh.hw.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	private static Scanner sc = new Scanner(System.in);
	public void calculator() {
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+, -, x, /) : ");
		char math = sc.next().charAt(0);
		switch(math) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
			break;
		case 'x':
			if(num1==0 || num2==0) {
				System.out.println("0으로 곱할 수 없습니다.");
				System.out.printf("%d x %d = 0\n", num1, num2);
			} else {
				System.out.printf("%d x %d = %d\n", num1, num2, num1*num2);				
			}
			break;
		case '/':
			if(num1==0 || num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.printf("%d / %d = 0\n", num1, num2);
			} else {
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
			}
			break;				
		default:
			System.out.println("비정상적인 연산자 입니다.");
		}
		
	}
	
	public void totalCalculator() {
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		int min = 0;
		int max = 0;
		int sum = 0;
		if(num1>num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지 정수들의 합 : %d\n", num1, num2, sum);
	}
	
	public void printProfile() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("성격 : ");
		String mind = sc.next();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		System.out.println("성격 : "+mind);
	}
	
	public void printScore() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int room = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		char floor;
		
		if(score>=90) {
			floor = 'A';
		} else if(score>=80 && score<90) {
			floor = 'B';
		} else if(score>=70 && score<80) {
			floor = 'C';
		} else if(score>=60 && score<70) {
			floor = 'D';
		} else {
			floor = 'F';
		}
		
		if(gender=='M') {
			System.out.println(grade+"학년 "+room+"반 "+num+"번 남학생 "+name+"의 점수는 "+score+"이고 "+floor+"학점 입니다.");			
		} else {
			System.out.println(grade+"학년 "+room+"반 "+num+"번 여학생 "+name+"의 점수는 "+score+"이고 "+floor+"학점 입니다.");						
		}
	}
	
	public void printStarNumber() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("양수가 아닙니다.");
		} else {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i-1; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}			
		}
	}
	
	public void sumRandom() {
		Random rd = new Random();
		int rdNum = rd.nextInt(99)+1;
		int sum = 0;
		for(int i=1; i<=rdNum; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n", rdNum, sum);
	}
	
	public void exceptGugu() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		for(int i=1; i<=9; i++) {
			if(i%num==0) {
				continue;
			} else {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		}
		
	}
	
	public void diceGame() {
		boolean run = true;
		while(run) {
			Random rd = new Random();
			int dice1 = rd.nextInt(6)+1;
			int dice2 = rd.nextInt(6)+1;
			int diceSum = dice1 + dice2;
			boolean answer = true;
			while(answer) {
				System.out.print("주사위 두 개의 합을 맞춰보세요(2~12 입력) : ");
				int check = sc.nextInt();
				if(check==diceSum) {
					System.out.println("정답입니다.");
					System.out.println("주사위의 합 : "+diceSum);
					answer = false;
				} else {
					System.out.println("틀렸습니다.");
				}
			}
			boolean conti = true;
			while(conti) {
				System.out.print("계속하시겠습니까? (y/n) : ");
				char conticheck = sc.next().charAt(0);
				switch(conticheck) {
				case 'y':
					conti = false;
					break;
				case 'n':
					System.out.println("종료합니다.");
					conti = false;
					run = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
		}
		
	}
	
}
