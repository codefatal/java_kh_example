package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		String result = "";
		c = new Circle(x, y, radius);
		double circleArea = 3.14 * radius * radius;
		result = c + " / " + circleArea;
		return result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		String result = "";
		c = new Circle(x, y, radius);
		double circleCircum = 3.14 * radius * 2;
		result = c + " / " + circleCircum;
		return result;
	}
}
