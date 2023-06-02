package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		int menuNum;
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE+"명 입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명 입니다.");
			if(mc.existMemberNum()!=mc.SIZE) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				
				while(true) {				
					System.out.print("메뉴 번호 : ");
					menuNum = sc.nextInt();
					if(menuNum==1) {
						insertMember();
						break;
					} else if(menuNum==2) {
						searchMember();
						break;
					} else if(menuNum==3) {
						updateMember();
						break;
					} else if(menuNum==4) {
						deleteMember();
						break;
					} else if(menuNum==5) {
						printAll();
						break;
					} else if(menuNum==9) {
						System.out.println("프로그램을 종료합니다.");
						return;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
			} else if(mc.existMemberNum()==mc.SIZE) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				
				while(true) {				
					System.out.print("메뉴 번호 : ");
					menuNum = sc.nextInt();
					if(menuNum==2) {
						searchMember();
						break;
					} else if(menuNum==3) {
						updateMember();
						break;
					} else if(menuNum==4) {
						deleteMember();
						break;
					} else if(menuNum==5) {
						printAll();
						break;
					} else if(menuNum==9) {
						System.out.println("프로그램을 종료합니다.");
						return;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
			}
		}
	}
	
	public void insertMember() {
		System.out.print("아이디 : ");
		String id = sc.next();
		while(true) {			
			if(mc.checkId(id)==true) {
				break;
			} else {
				System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		char gender;
		while(true) {			
			System.out.print("성별 : ");
			gender = sc.next().charAt(0);
			if(gender=='M' || gender=='m' || gender=='F' || gender=='f') {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		return;
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			searchId();
			return;
		} else if(menuNum==2) {
			searchName();
			return;
		} else if(menuNum==3) {
			searchEmail();
			return;
		} else if(menuNum==9) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String searchId = sc.next();
		System.out.println(mc.searchId(searchId));
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		mc.searchName(searchName);
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String searchEmail = sc.next();
		mc.searchEmail(searchEmail);
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			updatePassword();
			return;
		} else if(menuNum==2) {
			updateName();
			return;
		} else if(menuNum==3) {
			updateEmail();
			return;
		} else if(menuNum==9) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void updatePassword() {
		System.out.println("수정할 회원 ID와 비밀번호를 입력하세요.");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		mc.updatePassword(id, password);
	}
	
	public void updateName() {
		System.out.println("수정할 회원 ID와 이름을 입력하세요.");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		mc.updateName(id, name);
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원 ID와 이름을 입력하세요.");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		mc.updateEmail(id, email);
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			deleteOne();
			return;
		} else if(menuNum==2) {
			deleteAll();
			return;
		} else if(menuNum==9) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원 ID를 입력하세요 : ");
		String delId = sc.next();
		mc.delete(delId);
	}
	
	public void deleteAll() {
		System.out.println("등록된 회원 ID를 모두 삭제합니다.");
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char deleteCheck = sc.next().charAt(0);
		if(deleteCheck=='y') {
			mc.delete();
			System.out.println("모든 회원 ID 삭제가 완료되었습니다.");
		} else {
			System.out.println("삭제를 취소합니다.");
		}
	}
	
	public void printAll() {
		mc.printAll();
	}
}
