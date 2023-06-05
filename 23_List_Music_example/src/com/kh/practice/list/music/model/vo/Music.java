package com.kh.practice.list.music.model.vo;

import java.util.Objects;


public class Music implements Comparable<Object>  {
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + " / " + 
				"가수 : " + singer;
	}

	public int hashCode() {
		return Objects.hash();
	}
	
	public boolean equals(Object obj) {
		if(this.hashCode() == obj.hashCode()) {			
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Object o) {
		if(((Music)o).singer.compareTo(this.singer)>=1) return 1;
		else if(((Music)o).singer.compareTo(this.singer)<=-1) return -1; 
		return 0;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
}
