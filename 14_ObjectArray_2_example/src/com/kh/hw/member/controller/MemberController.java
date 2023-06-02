package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 2;
	
	public int existMemberNum() {
		int count = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i]!=null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		int count = 0;
		for(int i=0; i<SIZE; i++) {	
			if(m[i]==null) {
				return true;
			}
			if(inputId.equals(m[i].getId())) {
				count++;
				break;
			}
		}
		if(count>=1) {
			return false;
		} else {
			return true;
		}
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		int count = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null) {
				count++;
			} else {
				break;
			}
			
		}
		m[count] = new Member(id, name, password, email, gender, age);
		System.out.println("등록이 완료되었습니다.");
	}
	
	public String searchId(String id) {
		int count = 0;
		int search = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getId().equals(id)) {
				count++;
				search = i;
				break;
			}
		}
		if(count>=1) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			return m[search].inform();
		} else {
			System.out.println("검색결과가 없습니다.");
			return "";
		}
	}
	
	public Member[] searchName(String name) {
		int count = 0;
		int[] search = new int[SIZE];
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getName().equals(name)) {
				search[count] = i;
				count++;
			}
		}
		if(count>=1) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i=0; i<count; i++) {
				System.out.println(m[search[i]].inform());				
			}
			return m;
		} else {
			System.out.println("검색결과가 없습니다.");
			return m;
		}
	}
	
	public Member[] searchEmail(String email) {
		int count = 0;
		int[] search = new int[SIZE];
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getEmail().equals(email)) {
				search[count] = i;
				count++;
			}
		}
		if(count>=1) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i=0; i<count; i++) {
				System.out.println(m[search[i]].inform());				
			}
			return m;
		} else {
			System.out.println("검색결과가 없습니다.");
			return m;
		}
	}
	
	public boolean updatePassword(String id, String password) {
		int search = -1;
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getId().equals(id)) {
				search = i;
				break;
			}
		}
		if(search!=-1) {
			if(m[search].getId() != null) {	
				m[search].setPassword(password);
				System.out.println("수정이 성공적으로 완료되었습니다.");
			}
			return true;
		} else {
			System.out.println("존재하지 않는 ID입니다.");
			return false;
		}
	}
	
	public boolean updateName(String id, String name) {
		int search = -1;
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getId().equals(id)) {
				search = i;
				break;
			}
		}
		if(search!=-1) {			
			if(m[search].getId() != null) {	
				m[search].setName(name);
				System.out.println("수정이 성공적으로 완료되었습니다.");
			}
			return true;
		} else {
			System.out.println("존재하지 않는 ID입니다.");
			return false;
		}
	}
	
	public boolean updateEmail(String id, String email) {
		int search = -1;
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getId().equals(id)) {
				search = i;
				break;
			}
		}
		if(search!=-1) {			
			if(m[search].getId() != null) {	
				m[search].setEmail(email);
				System.out.println("수정이 성공적으로 완료되었습니다.");
			}
			return true;
		} else {
			System.out.println("존재하지 않는 ID입니다.");
			return false;
		}
	}
	
	public boolean delete(String id) {
		int search = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				continue;
			} else if(m[i].getId().equals(id)) {
				search = i;
				break;
			}
		}
		if(m[search].getId() != null) {	
			m[search] = null;
			System.out.println("회원 ID가 삭제되었습니다.");
			return true;
		} else {
			System.out.println("존재하지 않는 ID입니다.");
			return false;
		}
	}
	
	public void delete() {
		for(int i=0; i<SIZE; i++) {
			m[i] = null;
		}
	}
	
	public Member[] printAll() {
		for(int i=0; i<SIZE; i++) {	
			if(m[i]==null) {
				continue;
			} else {				
				System.out.println(m[i].inform());
			}
		}
		return m;
	}
}
