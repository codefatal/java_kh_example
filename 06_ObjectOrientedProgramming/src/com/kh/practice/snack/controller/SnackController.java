package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s = new Snack(kind, name, flavor, numOf, price);
		String result = "저장이 완료되었습니다.";
		return result;
	}
	
	public String confirmData() {
		String result = s.information();
		return result;
	}
}
