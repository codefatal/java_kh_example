package com.kh.practice.generics.model.vo;

import java.util.Objects;

public class Vegetable extends Farm {
private String name;
	
	public Vegetable() {}
	
	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return super.toString() + " : " + name;
	}
	
	public int hashCode() {
		return Objects.hash();
	}
	
	public boolean equals(Object o) {
		if(super.equals(o) && this.name.hashCode()==((Vegetable)o).name.hashCode()) {			
			return true;
		} else {			
			return false;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
