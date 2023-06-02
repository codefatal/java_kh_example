package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		for(int i=0; i<2; i++) {
			if (phone[i] instanceof GalaxyNote9) {
				result[i] = phone[i].printInformation();
			} else if(phone[i] instanceof V40) {
				result[i] = phone[i].printInformation();
			}
		}
		
		return result; 
	}
}
