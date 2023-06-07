package com.kh.practice.file.view;

import java.io.*;
import java.util.*;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt(); sc.nextLine();
			
			if(menuNum==1) {
				fileSave();
			} else if(menuNum==2) {
				fileOpen();
			} else if(menuNum==3) {
				fileEdit();
			} else if(menuNum==9) {
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it이라고 입력하면 종료됩니다.");
		String str = "";
		String filePath = "";
		StringBuilder sb = new StringBuilder();
		File f;
		char check = ' ';
		while(true) {
			System.out.print("내용 : ");
			str = sc.nextLine();
			if(str.equals("ex끝it")) break;
			sb.append(str+"\r\n");
		}
		while(true) {			
			System.out.print("저장할 파일 명을 입력해주세요 : ");
			filePath = sc.nextLine();
			f = new File(filePath);
			if(f.exists()) {
				while(true) {					
					System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
					check = sc.next().charAt(0);
					if(check=='y' || check=='Y') {
						fc.fileSave(filePath, sb);
						return;
					} else if(check=='n' || check=='N') {
						break;
					} else {
						System.out.println("다시 입력해주세요.");
					}
				}
			} else {
				fc.fileSave(filePath, sb);
				return;
			}
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String filePath = sc.nextLine();
		if(fc.checkName(filePath)==true) {
			System.out.println(fc.fileOpen(filePath));
			return;
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String filePath = sc.nextLine();
		String str = "";
		if(fc.checkName(filePath)==true) {
			StringBuilder sb = new StringBuilder();
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it이라고 입력하면 종료됩니다.");
			while(true) {
				System.out.print("내용 : ");
				str = sc.nextLine();
				if(str.equals("ex끝it")) break;
				sb.append(str+"\r\n");
			}
			fc.fileEdit(filePath, sb);
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}
}
