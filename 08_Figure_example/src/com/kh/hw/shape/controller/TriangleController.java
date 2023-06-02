package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		double area = 0.0;
		s = new Shape(3, height, width);
		area = (height*width)/2;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String result = "삼각형 : "+s.information();
		return result;
	}
}
