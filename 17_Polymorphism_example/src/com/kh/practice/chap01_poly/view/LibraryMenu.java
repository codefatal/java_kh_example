package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		while(true) {			
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			if(gender=='M' || gender=='m' || gender=='F' || gender=='f') {
				Member mem = new Member(name, age, gender);
				lc.insertMember(mem);
				break;
			} else {
				System.out.println("성별을 다시 입력해주세요.");
			}
		}
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				System.out.println(lc.myinfo());
			} else if(menuNum==2) {
				selectAll();
			} else if(menuNum==3) {
				searchBook();
			} else if(menuNum==4) {
				rentBook();
			} else if(menuNum==9) {
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
	public void selectAll() {
		for(int i=0; i<5; i++) {
			System.out.println(i+"번 도서 : "+lc.selectAll()[i]);			
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String searchKeyword = sc.next();
		for(int i=0; i<5; i++) {
			if(lc.searchBook(searchKeyword)[i]!=null) {
				System.out.println(lc.searchBook(searchKeyword)[i]);							
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int bookNum = sc.nextInt();
		if(lc.rentBook(bookNum)==0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(lc.rentBook(bookNum)==1) {
			System.out.println("나이 제한으로 대여 불가능 입니다.");
		} else if(lc.rentBook(bookNum)==2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
}
