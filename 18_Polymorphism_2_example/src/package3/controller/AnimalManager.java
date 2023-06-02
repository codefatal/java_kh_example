package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Dog("개1", "잡종1", 60);
		a[1] = new Cat("고양이1", "잡종1", "서울", "흰색");
		a[2] = new Dog("개2", "잡종2", 70);
		a[3] = new Cat("고양이2", "잡종2", "부산", "검은색");
		a[4] = new Dog("개3", "잡종3", 50);
		
		for(int i=0; i<5; i++) {
			a[i].speak();
		}
	}

}


