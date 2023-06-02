package com.kh.hw.view;

import java.util.Scanner;

import com.kh.hw.controller.Function;

public class Menu {
	private static Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		boolean run = true;
		System.out.println("1. 간단 계산기");
		System.out.println("2. 작은 수에서 큰 수까지 합계");
		System.out.println("3. 신상 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 별과 숫자 출력");
		System.out.println("6. 난수까지의 합계");
		System.out.println("7. 구구단");
		System.out.println("8. 주사위 숫자 알아맞추기 게임");
		System.out.println("9. 프로그램 종료");
		while(run) {
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			if(num>9 || num<=0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} else {
				switch(num) {
				case 1:
					new Function().calculator();
					break;
				case 2:
					new Function().totalCalculator();
					break;
				case 3:
					new Function().printProfile();
					break;
				case 4:
					new Function().printScore();
					break;
				case 5:
					new Function().printStarNumber();
					break;
				case 6:
					new Function().sumRandom();
					break;
				case 7:
					new Function().exceptGugu();
					break;
				case 8:
					new Function().diceGame();
					break;
				case 9:
					System.out.println("종료합니다.");
					run = false;
					break;
				}
			}
		}
		
		
	}
}
