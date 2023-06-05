package com.kh.practice.map.view;

import java.util.Map;
import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("======= KH 사이트 =======");
		while(true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				joinMembership();
			} else if(menuNum==2) {
				login();
				memberMenu();
			} else if(menuNum==3) {
				sameName();
			} else if(menuNum==9) {
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("****** 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt(); sc.nextLine();
			
			if(menuNum==1) {
				changePassword();
			} else if(menuNum==2) {
				changeName();
			} else if(menuNum==3) {
				System.out.println("로그아웃 되었습니다.");
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void joinMembership() {
		while(true) {			
			Member m;
			System.out.println("***** 회원 가입 *****");
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			m = new Member(password, name);
			if(mc.joinMembership(id, m)==true) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디 입니다 다시 입력해주세요.");
			}
		}
	}
	
	public void login() {
		System.out.println("***** 로그인 *****");
		while(true) {			
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			if(mc.login(id, password).equals(null)) {
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요.");
			} else {
				System.out.println(mc.login(id, password)+"님 환영합니다.");
				break;
			}
		}
	}
	
	public void changePassword() {
		System.out.println("***** 비밀번호 변경 *****");
		while(true) {			
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("기존 비밀번호 : ");
			String oldPw = sc.next();			
			System.out.print("변경할 비밀번호 : ");
			String newPw = sc.next();
			if(mc.changePassword(id, oldPw, newPw)==true) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		System.out.println("***** 이름 변경 *****");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("변경할 이름 : ");
		String name = sc.next();
		mc.changeName(id, name);
		
	}
	
	public void sameName() {
		System.out.println("***** 이름 찾기 *****");
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		for(Map.Entry<String, String> entry : mc.sameName(name).entrySet()) {			
			System.out.println(entry.getValue()+" - "+entry.getKey());
		}
	}
	
}
