package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		boolean run = true;
		while(run) {
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 3:
				triangleMenu();
				run = false;
				break;
			case 4:
				squareMenu();
				run = false;
				break;
			case 9:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}			
		}
		
	}
	
	public void triangleMenu() {
		boolean run = true;
		while(run) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				inputSize(3,num);
				break;
			case 2:
				inputSize(3,num);
				break;
			case 3:
				printInformation(num);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				run = false;
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void squareMenu() {
		boolean run = true;
		while(run) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				inputSize(4,num);
				break;
			case 2:
				inputSize(4,num);
				break;
			case 3:
				inputSize(4,num);
				break;
			case 4:
				printInformation(num);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				run = false;
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		double height = 0.0;
		double width = 0.0;
		if(type==3) {
			if(menuNum==1) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("삼각형 면적 : "+tc.calcArea(height, width));
			} else if(menuNum==2) {
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 출력되었습니다.");				
			}
		} else if(type==4) {
			if(menuNum==1 || menuNum==2) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();			
			}
			if(menuNum==1) {
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, width));
			} else if(menuNum==2) {
				System.out.println("사각형 면적 : "+scr.calcArea(height, width));
			} else if(menuNum==3) {
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 출력되었습니다.");
			}
		}
	}
	
	
	
	public void printInformation(int type) {
		switch(type) {
		case 3:
			System.out.println(tc.print());
			break;
		case 4:
			System.out.println(scr.print());
			break;
		}
	}
	
}
