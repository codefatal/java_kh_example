package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		double round = 0.0;
		s = new Shape(4, height, width);
		round = (height*2)+(width*2);
		return round;
	}
	
	public double calcArea(double height, double width) {
		double area = 0.0;
		s = new Shape(4, height, width);
		area = (height*width);
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String result = "사각형 : "+s.information();
		return result;
	}
}
