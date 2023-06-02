package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book> {
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
	
	public boolean equals(Object o) {
		if (this == o) return true; // 만일 현 객체 this와 매개변수 객체가 같을 경우 true
        if (!(o instanceof Book)) return false; // 만일 매개변수 객체가 Book 타입과 호환되지 않으면 false
        Book book = (Book) o; // 만일 매개변수 객체가 Book 타입과 호환된다면 다운캐스팅(down casting) 진행
        return Objects.equals(this.title, book.title); // this객체 이름과 매개변수 객체 이름이 같을경우 true, 다를 경우 false
	}
	
	@Override
	public int compareTo(Book b) {
		if(this.title.hashCode()>b.title.hashCode()) return 1;
		else if(this.title.hashCode()<b.title.hashCode()) return -1; 
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
