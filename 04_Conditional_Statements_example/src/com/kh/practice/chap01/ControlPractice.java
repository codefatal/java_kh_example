package com.kh.practice.chap01;

import java.io.IOException;
import java.util.Scanner;

public class ControlPractice {
	private static Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		boolean run = true;
		while(run) {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			if(num%2==0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int hangul = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		int total = hangul + math + english;
		double avg = total/3;
		
		
		System.out.println("국어 : " + hangul);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + english);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		
		if(hangul>=40 && math>=40 && english>=40 && avg>=60) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1: case 2: case 12:
			System.out.println(num + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice5() {
		String id = "myId";
		String passwd = "myPasswd12";
		
		System.out.print("아이디 : ");
		String inputId = sc.next();
		System.out.print("비밀번호 : ");
		String inputPasswd = sc.next();
		
		if(id.equals(inputId)) {
			if(passwd.equals(inputPasswd)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급(관리자/회원/비회원) : ");
		String check = sc.next();
		switch(check) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("정보를 조회할 수 없습니다.");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		double bmi = kg / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if(bmi>=18.5 && bmi<23) {
			System.out.println("정상 체중");
		} else if(bmi>=23 && bmi<25) {
			System.out.println("과체중");
		} else if(bmi>=25 && bmi<30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char math = sc.next().charAt(0);
		
		switch(math) {
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println(num1+" x "+num2+" = "+(num1*num2));
			break;
		case '/':
			System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
			break;
		case '%':
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int middle = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int last = sc.nextInt();
		System.out.print("과제 점수 : ");
		int work = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attendance = sc.nextInt();
		while(attendance<0 || attendance>20) {
			System.out.println("출석 회수는 1~20 사이만 입력 가능합니다.");
			System.out.print("출석 회수 : ");
			attendance = sc.nextInt();
		}
		double middleScore = middle * 0.2;
		double lastScore = last * 0.3;
		double workScore = work * 0.3;
		double attendenceScore = attendance * 1.0;
		double total = middleScore + lastScore + workScore + attendenceScore;
		System.out.println("=====결과=====");
		System.out.println("중간 고사 점수 (20) : " + middleScore);
		System.out.println("기말 고사 점수 (30) : " + lastScore);
		System.out.println("과제 점수 (30) : " + workScore);
		System.out.println("출석 점수 (20) : " + attendenceScore);
		if(attendance<=14) {
			System.out.print("Fail");
			System.out.println(" [출석 회수 부족 "+"("+attendance+"/20)]");
		} else if(total>=70) {
			System.out.println("총점 : " + total);
			System.out.println("Pass");
		} else {
			System.out.print("Fail");
			System.out.println(" [점수 미달]");
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public void practice10() {
		boolean run = true;
		while(run) {			
			System.out.println("==========");
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. P/F");
			System.out.println("11. 비밀번호 생성");
			System.out.println("0. 종료");
			System.out.println("==========");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			System.out.println("==========");
			switch(select) {
			case 1:
				new ControlPractice().practice1();
				break;
			case 2:
				new ControlPractice().practice2();
				break;
			case 3:
				new ControlPractice().practice3();
				break;
			case 4:
				new ControlPractice().practice4();
				break;
			case 5:
				new ControlPractice().practice5();
				break;
			case 6:
				new ControlPractice().practice6();
				break;
			case 7:
				new ControlPractice().practice7();
				break;
			case 8:
				new ControlPractice().practice8();
				break;
			case 9:
				new ControlPractice().practice9();
				break;
			case 11:
				new ControlPractice().practice11();
				break;				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int passwd = sc.nextInt();
		int arrNum[] = new int[4];
		if(passwd>=10000 || passwd<=999) {
			System.out.println("자리수 안맞음.");
		} else {
			for(int i=0; i<=3; i++) {
				arrNum[i] = passwd % 10;
				passwd /= 10;
			}			
			int i = 0;
			for(i=0; i<=2; i++) {
				if(arrNum[i]==arrNum[i+1]) {
					System.out.println("실패");
					break;
				} else {
					if(i==2) {
						System.out.println("성공");			
					}
					continue;
				}
			}
		}
		System.out.println("계속 하려면 Enter를 눌러주세요.");
		pause();
	}
	
	public static void pause() {
		try {
			System.in.read();
		} catch(IOException e) {}
	}
}
