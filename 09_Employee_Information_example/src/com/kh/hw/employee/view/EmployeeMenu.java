package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int menuNum = sc.nextInt();
			if(menuNum==1) {
				insertEmp();
			} else if(menuNum==2) {
				updateEmp();
			} else if(menuNum==3) {
				deleteEmp();
			} else if(menuNum==4) {
				printEmp();
			} else if(menuNum==9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 잘못 입력했습니다.");
			}
		}
	}
	
	public void insertEmp() {
		int empNo; String name; char gender; String phone;
		String dept; int salary; double bouns; 
		char check;
		System.out.print("사원 번호 : ");
		empNo = sc.nextInt();
		System.out.print("사원 이름 : ");
		name = sc.next();
		System.out.print("사원 성별 : ");
		gender = sc.next().charAt(0);
		System.out.print("전화 번호 : ");
		phone = sc.next();
		while(true) {
			System.out.print("추가정보를 입력하시겠습니까?(y/n) : ");
			check = sc.next().charAt(0);
			if(check=='y') {
				System.out.print("사원 부서 : ");
				dept = sc.next();
				System.out.print("사원 연봉 : ");
				salary = sc.nextInt();
				System.out.print("보너스 율 : ");
				bouns = sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, salary, bouns);
				break;
			} else if(check=='n') {
				ec.add(empNo, name, gender, phone);
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		return;
	}
	
	public void updateEmp() {
		String phone;
		int salary;
		double bouns;
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요.");
		int menuNum = sc.nextInt();
		if(menuNum==1) {
			System.out.print("수정할 전화번호 : ");
			phone = sc.next();
			ec.modify(phone);
		} else if(menuNum==2) {
			System.out.print("수정할 사원 연봉 : ");
			salary = sc.nextInt();
			ec.modify(salary);
		} else if(menuNum==3) {
			System.out.print("수정할 보너스 : ");
			bouns = sc.nextDouble();
			ec.modify(bouns);	
		} else if(menuNum==9) {
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		} else {
			System.out.println("잘못 입력했습니다.");
			return;			
		}
		
	}

	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char del = sc.next().charAt(0);
		if(del=='y') {
			System.out.println(ec.remove());
		} else if(del=='n') {
			return;
		}
	}
	
	public void printEmp() {
		System.out.println(ec.inform());
	}
	
}
