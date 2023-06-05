package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Object> {
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "도서명 : " + title + " / " +
				"저자명 : " + author + " / " + 
				"장르 : " + category + " / " +
				"가격 : " + price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.hashCode() == o.hashCode()) {			
			return true;
		} else {			
			return false;
		}
	}
	
	@Override
	public int compareTo(Object b) {
		if(this.title.compareTo(((Book)b).title)>=1) return 1;
		else if(this.title.compareTo(((Book)b).title)<=-1) return -1; 
		return 0;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
