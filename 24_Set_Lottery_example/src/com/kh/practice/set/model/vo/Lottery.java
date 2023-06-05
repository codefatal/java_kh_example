package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery implements Comparable<Object> {
	private String name;
	private String phone;
	
	public Lottery() {}
	
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " / " + 
				"휴대폰 번호 : " + phone;
	}

	public int hashCode() {
		return Objects.hash();
	}
	
	public boolean equals(Object o) {
		if(this.name.hashCode() == ((Lottery)o).name.hashCode() && this.phone.hashCode() == ((Lottery)o).phone.hashCode()) {			
			return true;
		} else {			
			return false;
		}
	}
	
	@Override
	public int compareTo(Object o) {
		if(this.name.compareTo(((Lottery)o).name)>=1) return 1;
		else if(this.name.compareTo(((Lottery)o).name)<=-1) return -1; 
		return 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
