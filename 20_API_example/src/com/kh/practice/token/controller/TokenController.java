package com.kh.practice.token.controller;

public class TokenController {
	public TokenController() {}
	
	public String afterToken(String str) {
		str = str.trim();
		str = str.replace(" ", "");
		
		return str;
	}
	
	public String firstCap(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		
		return input;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		String searchStr = ""+one;
		count = input.length() - input.replace(searchStr, "").length();
		return count;
	}
}
