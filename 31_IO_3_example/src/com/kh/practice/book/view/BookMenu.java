package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
		while(true) {	
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt(); sc.nextLine();
			
			if(menuNum==1) {
				fileSave();
			} else if(menuNum==2) {
				fileRead();
			} else if(menuNum==9) {
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		Calendar cal = Calendar.getInstance();
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt(); sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		String[] dateArr = date.split("-");
		cal.set(Calendar.YEAR, Integer.parseInt(dateArr[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(dateArr[1])-1);
		cal.set(Calendar.DATE, Integer.parseInt(dateArr[2]));
		System.out.println(cal.getTime());
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		int count = 0;
		bArr = bc.fileRead();
		for(int i=0; i<bArr.length; i++) {
			if(bArr[i]!=null) {
				count++;
			}
		}
		bArr[count] = new Book(title, author, price, cal, discount); 
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		bArr = bc.fileRead();
		for(int i=0; i<bArr.length; i++) {
			if(bArr[i]!=null) {				
				System.out.println(bArr[i]);
			}
		}
	}
}
