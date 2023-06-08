package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("0. 리스트 저장");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt(); sc.nextLine();
			
			if(menuNum==1) {
				addList();
			} else if(menuNum==2) {
				addAtZero();
			} else if(menuNum==3) {
				printAll();
			} else if(menuNum==4) {
				searchMusic();
			} else if(menuNum==5) {
				removeMusic();
			} else if(menuNum==6) {
				setMusic();
			} else if(menuNum==7) {
				ascTitle();
			} else if(menuNum==8) {
				descSinger();
			} else if(menuNum==9) {
				System.out.println("종료");
				return;
			} else if(menuNum==0) {
				saveFile();
			}
		}
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mc.addList(music);
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mc.addAtZero(music);
	}
	
	public void printAll() {
		String filePath = "music.ost";
		List<Music> volist = mc.printAll(filePath);
		for(Music vo : volist) {
			System.out.println(vo);
		}
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		if(mc.searchMusic(title)==null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println("검색한 곡은 "+mc.searchMusic(title)+"입니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		if(mc.searchMusic(title)==null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println(mc.removeMusic(title)+"을 삭제 했습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String modtitle = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();		
		Music music = new Music(modtitle, singer);
		if(mc.searchMusic(title)==null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(mc.setMusic(title, music)+"의 값이 변경되었습니다.");
		}
		
	}
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 *******");
		if(mc.ascTitle()==1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}
	
	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 *******");
		if(mc.descSinger()==1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}
	
	public void saveFile() {
		System.out.println("****** 곡정보를 파일에 저장 *******");
		String filePath = "music.ost";
		if(mc.saveFile(filePath)>=1) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
		List<Music> volist = mc.printAll(filePath);
		for(Music vo : volist) {
			System.out.println(vo);
		}
	}
	
}
