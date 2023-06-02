package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	private static Scanner sc = new Scanner(System.in);
	
	public void practice001() {
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1; i<=num;i++) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public void practice002() {
		boolean run = true;
		while(run) {			
			System.out.print("1이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();
			if(num<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for(int i=1; i<=num;i++) {
					System.out.print(i+" ");
				}
				run = false;
			}
		}
		
	}
	
	public void practice003() {
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=num; i>=1;i--) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public void practice004() {
		boolean run = true;
		while(run) {			
			System.out.print("1이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();
			if(num<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for(int i=num; i>=1;i--) {
					System.out.print(i+" ");
				}
				run = false;
			}
		}
		
	}
	
	public void practice005() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i!=num) {
				System.out.print(i + " + ");				
			} else {
				System.out.print(i);
			}			
			sum += i;
		}
		System.out.println(" = "+sum);
	}
	
	public void practice006() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1==0 || num2==0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else if(num1>num2) {
			for(int i=num2;i<=num1;i++) {
				System.out.print(i+" ");
			}
		} else {
			for(int i=num1;i<=num2;i++) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public void practice007() {
		boolean run = true;
		while(run) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1==0 || num2==0) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			} else if(num1>num2) {
				for(int i=num2;i<=num1;i++) {
					System.out.print(i+" ");
					run = false;
				}
			} else {
				for(int i=num1;i<=num2;i++) {
					System.out.print(i+" ");
					run = false;
				}
			}
		}
		
	}
	
	public void practice008() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("===== "+num+"단 =====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%2d * %2d = %2d\n", num, su, num*su);
		}
	}
	
	public void practice009() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num>=10 || num<=1) {
			System.out.println("2~9 이하의 숫자만 입력해주세요.");
		} else {
			for(int dan=num; dan<=9; dan++) {
				System.out.println("===== "+dan+"단 =====");
				for(int su=1; su<=9; su++) {
					System.out.printf("%2d * %2d = %2d\n", dan, su, dan*su);
				}			
			}			
		}
	}
	
	public void practice010() {
		boolean run = true;
		while(run) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			if(num>=10 || num<=1) {
				System.out.println("2~9 이하의 숫자만 입력해주세요.");
			} else {
				for(int dan=num; dan<=9; dan++) {
					System.out.println("===== "+dan+"단 =====");
					for(int su=1; su<=9; su++) {
						System.out.printf("%2d * %2d = %2d\n", dan, su, dan*su);
					}
				}
				run = false;
			}
		}
		
	}
	
	public void practice011() {
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int plusNum = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.print(startNum+" ");
			startNum += plusNum;
		}
	}
	
	public void practice012() {
		System.out.print("연산자(+, -, *, /, %) : ");
		int num1 = 0;
		int num2 = 0;
		String math = sc.next();
		if(!(math.equals("exit"))) {
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();			
		}
		
		switch(math) {
		case "+":
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d x %d = %d\n", num1, num2, num1*num2);
			break;
		case "/":
			if(num1==0 || num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} else {
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);				
			}
			break;
		case "%":
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
		case "exit":
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
		}
		
	}
	
	public void practice013() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	public void practice014() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=num; i>=1;i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	public void practice015() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int calc = 0;
		int div;
		int count = 0;
		if(num<=1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i=1; i<=num; i++) {
				calc = num;
				div = calc%=i;
				if(div==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.println("소수 입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}
			
		}
	}
	
	public void practice016() {
		boolean run = true;
		while(run) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			int calc = 0;
			int div;
			int count = 0;
			if(num<=1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				for(int i=1; i<=num; i++) {
					calc = num;
					div = calc%=i;
					if(div==0) {
						count+=1;
					}
				}
				if(count==2) {
					System.out.println("소수 입니다.");
				} else {
					System.out.println("소수가 아닙니다.");
				}
				run = false;
			}
		}
	}
	
	public void practice017() {
		System.out.print("숫자 : ");
		int num = 0;
		num = sc.nextInt();
		int calc = 0;
		int div;
		int decimal[] = new int[num];
		int count = 0;
		int seed = 0;
		if(num<=1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i=1; i<=num; i++) {
				count = 0;
				for(int j=1; j<=num; j++) {
					calc = i;
					div = calc%=j;
					if(div==0) {
						count+=1;
					}
				}
				if(count==2) {
					decimal[seed] = i;
					seed++;
				}
			}
			for(int i=0; i<seed;i++) {
				System.out.print(decimal[i]+" ");
			}
			System.out.println();
			System.out.printf("2부터 %d까지 소수의 개수는 %d개 입니다.\n", num, seed);
		}
	}
	
	public void practice018() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int boxCount = 0;
		int count = 0;
		int box[] = new int[num];
		
		
		for(int i=1; i<=num; i++) {
			if(i%2==0 && i%3==0) {
				box[boxCount] = i;
				count++;
				boxCount++;
			} else if(i%2==0) {
				box[boxCount] = i;
				boxCount++;		
			} else if(i%3==0) {
				box[boxCount] = i;
				boxCount++;				
			} else {
				continue;
			}
		}
		for(int i=0;i<=boxCount-1;i++) {
			System.out.print(box[i]+" ");
		}
		System.out.println();
		System.out.println("count : "+count);
		
	}

	public void practice019() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int star = 1;
		int space = num-1;
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star+=1;
			space-=1;
		}
		
	}
	
	public void practice020() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int star = 1;
		
		for(int i=1; i<=num*2-1; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<num) {
				star+=1;
			} else {
				star-=1;
			}
		}
		
	}
	
	public void practice021() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int line = num*2-1;
		int star = 1;
		int space = line/2;
		for(int i=0; i<=line/2; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			for(int l=1; l<=space; l++) {
				System.out.print(" ");
			}
			star+=2;
			space-=1;
			System.out.println();
		}
		
	}
	
	public void practice022() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int space = 0;
		
		for(int i=1; i<=num; i++) {
			if(i==1 || i==num) {
				space = 0;
				for(int j=1; j<=num; j++) {
					System.out.print("*");
				} 
			} else {
				space = num-2;
				System.out.print("*");
				for(int l=1; l<=space; l++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
