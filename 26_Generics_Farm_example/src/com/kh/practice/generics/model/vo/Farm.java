package com.kh.practice.generics.model.vo;

import java.util.Objects;

public class Farm {
	private String kind;
	
	public Farm() {}
	
	public Farm(String kind) {
		this.kind = kind;
	}
	
	public String toString() {
		return kind;
	}
	
	public int hashCode() {
		return Objects.hash();
	}
	
	public boolean equals(Object o) {
		if(this.kind.hashCode() == ((Farm)o).kind.hashCode()) {			
			return true;
		} else {			
			return false;
		}
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}


