package com.kh.practice1.run;

import com.kh.practice1.func.VariablePractice1;
import com.kh.practice1.func.VariablePractice2;
import com.kh.practice1.func.VariablePractice3;
import com.kh.practice1.func.VariablePractice4;

public class Run {
	public static void main(String[] args) {
//		new VariablePractice1().Method();
//		new VariablePractice2().Method();
//		new VariablePractice3().Method();
		new VariablePractice4().Method();
		
		// 객체/인스턴스 vp를 생성
		// 동일한 class 안에 메소드를 불러올땐 아래와 같은 방법이 heap 메모리를 덜먹는다.
		VariablePractice1 vp = new VariablePractice1();
		vp.Method();
//		vp.Method();
//		vp.Method();
//		vp.Method();
	}
}
