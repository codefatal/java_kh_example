package com.kh.practice.array;

import java.util.*;

public class ArrayPractice {
	private static Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice3() {
		System.out.print("양의 정수 : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		String[] strArr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(strArr[1]);
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		char[] strArr = new char[str.length()];
		int[] idx = new int[str.length()];
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			strArr[i] = str.charAt(i);
			if(strArr[i]==ch) {
				idx[count] = i;
				count++;
			}
		}
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<count; i++) {
			System.out.print(idx[i]+" ");
		}
		System.out.println();
		System.out.println(ch+" 개수 : "+count);
	}
	
	public void practice6() {
		char[] week = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>=0 && num<=6) {
			System.out.println(week[num]+"요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {
		System.out.print("정수 : ");
		int arrNum = sc.nextInt();
		int[] arr = new int[arrNum];
		int idx = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			idx = sc.nextInt();
			arr[i] = idx;
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : "+sum);
	}
	
	public void practice8() {
		int num = 0;
		int count = 1;
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num>=3 && num%2==1) {
				for(int i=0; i<num; i++) {
					if(i>=num/2) {						
						System.out.print(count+" ");
						count--;
					} else {
						System.out.print(count+" ");
						count++;
					}
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {
		String[] chicken = {"후라이드", "양념", "간장", "파닭"};
		int count = 0;
		System.out.print("치킨 이름을 입력하세요 : ");
		String selectChicken = sc.next();
		for(int i=0; i<chicken.length; i++) {
			if(selectChicken.equals(chicken[i])) {
				System.out.println(chicken[i]+"치킨 배달 가능");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(selectChicken+"치킨은 없는 메뉴 입니다.");
		}
	}
	
	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String sno = sc.next();
		char[] masking = new char[sno.length()];
		char[] original = new char[sno.length()];
		
		for(int i=0; i<sno.length(); i++) {
			if(i>=8) {
				masking[i] = '*';
			} else {				
				masking[i] = sno.charAt(i);
			}
			original[i] = sno.charAt(i);
			System.out.print(masking[i]);
		}
		
	}
	
	public void practice11() {
		Random rd = new Random();
		int[] rdArr = new int[10];
		for(int i=0; i<rdArr.length; i++) {
			rdArr[i] = rd.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(rdArr));
	}
	
	public void practice12() {
		Random rd = new Random();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] rdArr = new int[10];
		for(int i=0; i<rdArr.length; i++) {
			rdArr[i] = rd.nextInt(10)+1;
			if(rdArr[i]>max) {
				max = rdArr[i];
			}
			if(rdArr[i]<min) {
				min = rdArr[i];
			}
		}	
		System.out.println(Arrays.toString(rdArr));
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice13() {
		Random rd = new Random();
		int[] rdArr = new int[10];
		for(int i=0; i<rdArr.length; i++) {
			rdArr[i] = rd.nextInt(10)+1;
			for(int j=0; j<i; j++) {
				if(rdArr[i]==rdArr[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(rdArr));
	}
	
	public void practice14() {
		Random rd = new Random();
		int[] rdArr = new int[6];
		for(int i=0; i<rdArr.length; i++) {
			rdArr[i] = rd.nextInt(46)+1;
			for(int j=0; j<i; j++) {
				if(rdArr[i]==rdArr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(rdArr);
		System.out.println(Arrays.toString(rdArr));
	}
	
	public void practice15() {
		System.out.print("문자열 : ");
		String str = sc.next();
		String[] strArr = new String[str.length()];
		for(int i=0; i<str.length(); i++) {
			strArr[i] = str.substring(i, i+1);
		}
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(strArr));
		
		String[] resultArr = hashSet.toArray(new String[0]);
		
		System.out.println("문자열에 있는 문자 : ");
		System.out.println(Arrays.toString(resultArr));
		System.out.println("문자 개수 : "+resultArr.length);
	}
	
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrNum = sc.nextInt();
		int arrNumPlus = 0;
		int count = 1;
		String book = "";
		ArrayList<String> bookList = new ArrayList<>();
		for(int i=0; i<arrNum; i++) {
			System.out.print(count+"번째 문자열 : ");
			book = sc.next();
			bookList.add(book);
			count++;
		}
		while(true) {			
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char checkNum = sc.next().charAt(0);
			if(checkNum=='y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				arrNumPlus = sc.nextInt();
				for(int i=0; i<arrNumPlus; i++) {
					System.out.print(count+"번째 문자열 : ");
					book = sc.next();
					bookList.add(book);
					count++;
				}
			} else if(checkNum=='n') {
				break;
			}
		}
		System.out.println(bookList.toString());
	}
}
