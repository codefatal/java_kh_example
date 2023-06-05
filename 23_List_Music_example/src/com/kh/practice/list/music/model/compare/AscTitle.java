package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
		double o1title = ((Music)o1).getTitle().hashCode();
		double o2title = ((Music)o2).getTitle().hashCode();
		double o1singer = ((Music)o1).getSinger().hashCode();
		double o2singer = ((Music)o2).getSinger().hashCode();
		if(o1title==o2title) {			
			return Double.compare(o1singer, o2singer);
		}
		return Double.compare(o1title, o2title);
	}
}
