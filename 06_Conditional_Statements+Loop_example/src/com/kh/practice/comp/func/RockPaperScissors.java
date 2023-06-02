package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private static Scanner sc = new Scanner(System.in);
	
	public void rps() {
		Random rd = new Random();
		int win = 0;
		int drow = 0;
		int lose = 0;
		int count = 0;
		boolean run = true;
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		while(run) {			
			System.out.print("가위바위보 : ");
			String myAttack = sc.next();
			String comAttack;
			if(myAttack.equals("가위") || myAttack.equals("바위") || myAttack.equals("보")) {
				int computer = rd.nextInt(3);
				switch(computer) {
				case 0:
					comAttack = "가위";
					System.out.println("컴퓨터 : "+comAttack);
					System.out.println(name+" : "+myAttack);
					if(myAttack.equals("가위")) {
						count++;
						drow++;
						System.out.println("비겼습니다.");
					} else if(myAttack.equals("바위")) {						
						count++;
						win++;
						System.out.println("이겼습니다.");
					} else {
						count++;
						lose++;
						System.out.println("졌습니다.");
					}
					break;
				case 1:
					comAttack = "바위";
					System.out.println("컴퓨터 : "+comAttack);
					System.out.println(name+" : "+myAttack);		
					if(myAttack.equals("가위")) {
						count++;
						lose++;
						System.out.println("졌습니다.");
					} else if(myAttack.equals("바위")) {
						count++;
						drow++;
						System.out.println("비겼습니다.");
					} else {
						count++;
						win++;
						System.out.println("이겼습니다.");
					}
					break;			
				case 2:
					comAttack = "보";					
					System.out.println("컴퓨터 : "+comAttack);
					System.out.println(name+" : "+myAttack);		
					if(myAttack.equals("가위")) {
						count++;
						win++;
						System.out.println("이겼습니다.");
					} else if(myAttack.equals("바위")) {
						count++;
						lose++;
						System.out.println("졌습니다.");
					} else {
						count++;
						drow++;
						System.out.println("비겼습니다.");
					}
					break;			
				default:
					System.out.println("Error");
				}
					
			} else if(myAttack.equals("exit")) {
				System.out.println(count+"전 "+win+"승 "+drow+"무 "+lose+"패");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
