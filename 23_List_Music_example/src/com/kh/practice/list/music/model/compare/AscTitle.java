package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {
	
	@Override
	public int compare(Music m1, Music m2) {
		double m1title = m1.getTitle().hashCode();
		double m2title = m2.getTitle().hashCode();
		double m1singer = m1.getSinger().hashCode();
		double m2singer = m2.getSinger().hashCode();
		if(m1title==m2title) {			
			return Double.compare(m1singer, m2singer);
		}
		return Double.compare(m1title, m2title);
	}
}
