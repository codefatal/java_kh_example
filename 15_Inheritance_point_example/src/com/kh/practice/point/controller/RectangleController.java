package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		String result = "";
		r = new Rectangle(x, y, width, height);
		double rectangleArea = height * width;
		result = r + " / " + rectangleArea;
		return result;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		String result = "";
		r = new Rectangle(x, y, width, height);
		double rectanglePerimeter = 2 * (height + width);
		result = r + " / " + rectanglePerimeter;
		return result;
	}
}
