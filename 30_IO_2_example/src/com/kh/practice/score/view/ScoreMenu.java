package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** 성적 *****");
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt(); sc.nextLine();
			
			if(menuNum==1) {
				saveScore();
			} else if(menuNum==2) {
				readScore();
			} else if(menuNum==9) {
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void saveScore() {
		int num = 0;
		while(true) {
			System.out.println((num+1)+"번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			int sum = kor+eng+math;
			double avg = sum/3.0;
			scr.saveScore(name, kor, eng, math, sum, avg);
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속하시려면 아무키나 입력하세요 : ");
			char check = sc.next().charAt(0); sc.nextLine();
			if(check=='n' || check=='N') {
				return;
			} else {
				num++;
			}
		}
	}
	
	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		try {
			DataInputStream dis = new DataInputStream(scr.readScore());
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			count = 0;
			while(true) {
				try {					
					String str = dis.readUTF();
					System.out.print(str);
					System.out.print("\t");
					int[] score = new int[4];
					for(int j=0; j<4; j++) {
						score[j] = dis.readInt();
						System.out.print(score[j]);
						System.out.print("\t");
						if(j==3) {
							sumAll += score[j];
						}
					}
					double avg = dis.readDouble();
					System.out.print(avg);
					System.out.println();
					avgAll += avg;
					count++;
				} catch(EOFException e) {
					break;
				}
			}
			if(dis!=null) dis.close();
			avgAll /= count;
			System.out.println("====================");
			System.out.println("읽은 횟수\t전체 합계\t전체 평균");
			System.out.print(count+"\t"+sumAll+"\t"+avgAll+"\n");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
