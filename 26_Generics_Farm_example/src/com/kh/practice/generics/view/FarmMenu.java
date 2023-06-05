package com.kh.practice.generics.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("======= KH 마트 =======");
		while(true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				adminMenu();
			} else if(menuNum==2) {
				customerMenu();
			} else if(menuNum==9) {
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("***** 직원 메뉴 *****");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				addNewKind();
				printFarm();
			} else if(menuNum==2) {
				removeKind();
				printFarm();
			} else if(menuNum==3) {
				changeAmount();
				printFarm();
			} else if(menuNum==4) {
				printFarm();
			} else if(menuNum==9) {
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("***** 고객 메뉴 *****");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				buyFarm();
				printFarm();
			} else if(menuNum==2) {
				removeFarm();
				printFarm();
			} else if(menuNum==3) {
				printBuyFarm();
				printFarm();
			} else if(menuNum==9) {
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 1-1. 새 농산물 추가용 view 메소드
	public void addNewKind() {
		String kind = "";
		String name = "";
		int count = 0;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("종류 선택 : ");
			int kindNum = sc.nextInt();
			if(kindNum==1) {
				kind = "과일";
				System.out.print("이름 : ");
				name = sc.next();
				Fruit fruit = new Fruit(kind, name);
				System.out.print("수량 : ");
				count = sc.nextInt();
				if(fc.addNewKind(fruit, count)==true) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패했습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==2) {
				kind = "채소";
				System.out.print("이름 : ");
				name = sc.next();
				Vegetable vetgetable = new Vegetable(kind, name);
				System.out.print("수량 : ");
				count = sc.nextInt();
				if(fc.addNewKind(vetgetable, count)==true) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패했습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==3) {
				kind = "견과";
				System.out.print("이름 : ");
				name = sc.next();
				Nut nut = new Nut(kind, name);
				System.out.print("수량 : ");
				count = sc.nextInt();
				if(fc.addNewKind(nut, count)==true) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패했습니다. 다시 입력해주세요.");
					return;
				}
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 1-2. 종류 삭제용 view 메소드
	public void removeKind() {
		String kind = "";
		String name = "";
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("종류 선택 : ");
			int kindNum = sc.nextInt();
			if(kindNum==1) {
				kind = "과일";
				System.out.print("이름 : ");
				name = sc.next();
				Fruit fruit = new Fruit(kind, name);
				if(fc.removeKind(fruit)==true) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==2) {
				kind = "채소";
				System.out.print("이름 : ");
				name = sc.next();
				Vegetable vetgetable = new Vegetable(kind, name);
				if(fc.removeFarm(vetgetable)==true) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==3) {
				kind = "견과";
				System.out.print("이름 : ");
				name = sc.next();
				Nut nut = new Nut(kind, name);
				if(fc.removeFarm(nut)==true) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					return;
				}
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 1-3. 수량 수정용 view 메소드
	public void changeAmount() {
		String kind = "";
		String name = "";
		int count = 0;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("종류 선택 : ");
			int kindNum = sc.nextInt();
			if(kindNum==1) {
				kind = "과일";
				System.out.print("이름 : ");
				name = sc.next();
				Fruit fruit = new Fruit(kind, name);
				System.out.print("수량 : ");
				count = sc.nextInt();
				if(fc.changeAmount(fruit, count)==true) {
					System.out.println("농산물 수량이 수정되었습니다.");
					return;
				} else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==2) {
				kind = "채소";
				System.out.print("이름 : ");
				name = sc.next();
				Vegetable vetgetable = new Vegetable(kind, name);
				System.out.print("수량 : ");
				count = sc.nextInt();
				if(fc.changeAmount(vetgetable, count)==true) {
					System.out.println("농산물 수량이 수정되었습니다.");
					return;
				} else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==3) {
				kind = "견과";
				System.out.print("이름 : ");
				name = sc.next();
				Nut nut = new Nut(kind, name);
				System.out.print("수량 : ");
				count = sc.nextInt();
				if(fc.changeAmount(nut, count)==true) {
					System.out.println("농산물 수량이 수정되었습니다.");
					return;
				} else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
					return;
				}
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 1-4. 농산물 목록 출력용 view 메소드
	public void printFarm() {
		System.out.println("현재 KH마트 농산물 수량");
		Set<Farm> keySet = fc.printFarm().keySet();
		for(Farm key : keySet) {
			System.out.println(key + "(" + fc.printFarm().get(key) + "개)");
		}
	}
	
	// 2-1. 농산물 구매용 view 메소드
	public void buyFarm() {
		String kind = "";
		String name = "";
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("종류 선택 : ");
			int kindNum = sc.nextInt();
			if(kindNum==1) {
				kind = "과일";
				System.out.print("이름 : ");
				name = sc.next();
				Fruit fruit = new Fruit(kind, name);
				if(fc.buyFarm(fruit)==true) {
					System.out.println("구매에 성공하였습니다.");
					return;
				} else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==2) {
				kind = "채소";
				System.out.print("이름 : ");
				name = sc.next();
				Vegetable vetgetable = new Vegetable(kind, name);
				if(fc.buyFarm(vetgetable)==true) {
					System.out.println("구매에 성공하였습니다.");
					return;
				} else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==3) {
				kind = "견과";
				System.out.print("이름 : ");
				name = sc.next();
				Nut nut = new Nut(kind, name);
				if(fc.buyFarm(nut)==true) {
					System.out.println("구매에 성공하였습니다.");
					System.out.println("현재 KH마트 농산물 수량");
					Set<Farm> keySet = fc.printFarm().keySet();
					for(Farm key : keySet) {
						System.out.println(key + "(" + fc.printFarm().get(key) + "개)");
					}
					return;
				} else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
					return;
				}
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 2-2. 농산물 구매 취소용 view 메소드
	public void removeFarm() {
		String kind = "";
		String name = "";
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("종류 선택 : ");
			int kindNum = sc.nextInt();
			if(kindNum==1) {
				kind = "과일";
				System.out.print("이름  : ");
				name = sc.next();
				Fruit fruit = new Fruit(kind, name);
				if(fc.removeFarm(fruit)==true) {
					System.out.println("구매 취소에 성공하였습니다.");
					System.out.println("현재 KH마트 농산물 수량");
					Set<Farm> keySet = fc.printFarm().keySet();
					for(Farm key : keySet) {
						System.out.println(key + "(" + fc.printFarm().get(key) + "개)");
					}
					return;
				} else {
					System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==2) {
				kind = "채소";
				System.out.print("이름 : ");
				name = sc.next();
				Vegetable vetgetable = new Vegetable(kind, name);
				if(fc.removeFarm(vetgetable)==true) {
					System.out.println("구매 취소에 성공하였습니다.");
					return;
				} else {
					System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
					return;
				}
			} else if(kindNum==3) {
				kind = "견과";
				System.out.print("이름 : ");
				name = sc.next();
				Nut nut = new Nut(kind, name);
				if(fc.removeFarm(nut)==true) {
					System.out.println("구매 취소에 성공하였습니다.");
					return;
				} else {
					System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
					return;
				}
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	
	// 2-3. 구입한 농산물 출력용 view 메소드
	public void printBuyFarm() {
		Iterator<Farm> its = fc.printBuyFarm().iterator();
		System.out.println(fc.printBuyFarm());
	}
}
