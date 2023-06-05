package com.kh.practice.set.view;

import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("======= KH 추첨 프로그램 =======");
		while(true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt(); sc.nextLine();
			if(menuNum==1) {
				insertObject();
			} else if(menuNum==2) {
				deleteObject();
			} else if(menuNum==3) {
				winObject();
			} else if(menuNum==4) {
				sortedWinObject();
			} else if(menuNum==5) {
				searchWinner();
			} else if(menuNum==9) {
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 1. 추첨 대상 추가용 view 메소드
	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int people = sc.nextInt(); sc.nextLine();
		Lottery lottery = new Lottery();
		String name = "";
		String phone = "";
		
		for(int i=0; i<people; i++) {
			while(true) {				
				System.out.print((i+1)+"번째 이름 : ");
				name = sc.nextLine();
				System.out.print((i+1)+"번째 핸드폰 번호('-' 빼고) : ");
				phone = sc.nextLine();
				lottery = new Lottery(name, phone);
				if(lc.insertObject(lottery)==false) {
					System.out.println("중복된 대상입니다. 다시 입력하세요.");
				} else {
					break;
				}
			}
		}
		System.out.println("추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		Lottery lottery = new Lottery();
		String name = "";
		String phone = "";
						
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("핸드폰 번호('-' 빼고) : ");
		phone = sc.nextLine();
		lottery = new Lottery(name, phone);
		if(lc.deleteObject(lottery)==true){
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		System.out.println(lc.winObject());
	}
	
	public void sortedWinObject() {
		System.out.println(lc.sortedWinObject());
	}
	
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		Lottery lottery = new Lottery();
		String name = "";
		String phone = "";
						
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("핸드폰 번호('-' 빼고) : ");
		phone = sc.nextLine();
		lottery = new Lottery(name, phone);
		if(lc.searchWinner(lottery)==true) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
