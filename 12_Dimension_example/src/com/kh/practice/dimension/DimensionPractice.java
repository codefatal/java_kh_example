package com.kh.practice.dimension;

import java.util.*;

public class DimensionPractice {
	private static Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int count = 1;
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr[i].length-1; j>=0; j--) {
				arr[i][j] = count;
				count++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void practice4() {
		Random rd = new Random();
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[i][j] = rd.nextInt(10)+1;
				arr[arr.length-1][j] += arr[i][j];
				arr[i][arr.length-1] += arr[i][j];
				arr[arr.length-1][arr.length-1] += arr[i][j];
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void practice5() {
		int col = 0;
		int row = 0;
		Random rd = new Random();
		while(true) {
			System.out.print("행 크기 : ");
			col = sc.nextInt();
			System.out.print("열 크기 : ");
			row = sc.nextInt();
			if((col>=1 && col<=10) && (row>=1 && row<=10)) {
				break;
			} else {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			}
		}
		char[][] arr = new char[col][row];
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++){
				arr[i][j] = (char)(rd.nextInt(26)+65);
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr.length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
	}
	
	public void practice7() {
		Random rd = new Random();
		int col = 0;
		int row = 0;
		int count = 0;
		char[][] arr;
		System.out.print("행의 크기 : ");
		col = sc.nextInt();
		arr = new char[col][];
		for(int i=0; i<col; i++) {
			System.out.print(i+"행의 열 크기 : ");
			row = sc.nextInt();
			arr[i] = new char[row];
		}
		for(int j=0; j<arr.length; j++) {
			for(int k=0; k<arr[j].length; k++) {
				arr[j][k] = (char)(97+count);
				count++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void practice8() {
		String[] nameArr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] room1 = new String[2][3]; 
		String[][] room2 = new String[2][3];
		int count = 0;
		System.out.println("== 1분단 ==");
		for(int k=0; k<room1[0].length; k++) {
			for(int j=0; j<room1.length; j++) {
				room1[j][k] = nameArr[count];
				System.out.print(room1[j][k]+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int k=0; k<room2[0].length; k++) {
			for(int j=0; j<room2.length; j++) {
				room2[j][k] = nameArr[count];
				System.out.print(room2[j][k]+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		String[] nameArr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] room1 = new String[2][3]; 
		String[][] room2 = new String[2][3];
		int count = 0;
		System.out.println("== 1분단 ==");
		for(int k=0; k<room1[0].length; k++) {
			for(int j=0; j<room1.length; j++) {
				room1[j][k] = nameArr[count];
				System.out.print(room1[j][k]+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int k=0; k<room2[0].length; k++) {
			for(int j=0; j<room2.length; j++) {
				room2[j][k] = nameArr[count];
				System.out.print(room2[j][k]+" ");
				count++;
			}
			System.out.println();
		}
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String select = sc.next();
		for(int i=0; i<room1.length; i++){
			for(int j=0; j<room1[i].length; j++) {
				if(select.equals(room1[i][j])) {
					if(j==0) {						
						System.out.println("1분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					} else if(j==1) {
						System.out.println("1분단 "+(i+1)+"번째 줄 오른쪽에 있습니다.");						
					}
				}
			}
		}
		for(int i=0; i<room2.length; i++){
			for(int j=0; j<room2[i].length; j++) {
				if(select.equals(room2[i][j])) {
					if(j==0) {						
						System.out.println("2분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					} else if(j==1) {
						System.out.println("2분단 "+(i+1)+"번째 줄 오른쪽에 있습니다.");						
					}
				}
			}
		}
	}
	
	public void practice10() {
		String[][] strArr = new String[6][6];
		int col = 0;
		int row = 0;
		while(true) {			
			System.out.print("행 인덱스 입력 : ");
			col = sc.nextInt();
			System.out.print("열 인덱스 입력 : ");
			row = sc.nextInt();
			if((col>=0 && col<=5) && (row>=0 && row<=5)) {
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		System.out.print("  ");
		for(int i=0; i<strArr.length; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<strArr.length; i++) {
			System.out.print(i+" ");
			for(int j=0; j<strArr[i].length; j++) {
				if(i==col && j==row) {
					strArr[col][row] = "X";
					System.out.print(strArr[i][j]+" ");
				} else {					
					strArr[i][j] = "-";
					System.out.print(strArr[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice11() {
		String[][] strArr = new String[6][6];
		int col = 0;
		int row = 0;
		while(true) {
			while(true) {				
				System.out.print("행 인덱스 입력 : ");
				col = sc.nextInt();
				if (col==99) {
					System.out.println("프로그램 종료");
					return;
				}
				System.out.print("열 인덱스 입력 : ");
				row = sc.nextInt();
				if((col>=0 && col<=5) && (row>=0 && row<=5)) {
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			}
			System.out.print("  ");
			for(int i=0; i<strArr.length; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i=0; i<strArr.length; i++) {
				System.out.print(i+" ");
				for(int j=0; j<strArr[i].length; j++) {
					if(i==col && j==row) {
						strArr[col][row] = "X";
						System.out.print(strArr[i][j]+" ");
					} else {					
						strArr[i][j] = "-";
						System.out.print(strArr[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}
	
}
