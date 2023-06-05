package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		if(music==null) {
			System.out.println("추가 실패");
			return 0;
		} else {			
			list.add(music);
			System.out.println("추가 성공");
			return 1;
		}
	}
	
	public int addAtZero(Music music) {
		if(music==null) {
			System.out.println("추가 실패");
			return 0;
		} else {			
			list.add(0, music);
			System.out.println("추가 성공");
			return 1;
		}
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		Music searchMusic = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)){
				searchMusic = list.get(i);
			}
		}
		return searchMusic;
	}
	
	public Music removeMusic(String title) {
		Music removeMusic = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				removeMusic = list.get(i);
				list.remove(i);
			}
		}
		return removeMusic;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.set(i, music);
			}
		}
		return music;
	}
	
	public int ascTitle() {
		Comparator<Object> cmp = new AscTitle();
		Collections.sort(list, cmp);
		if(list.isEmpty()) {			
			return 0;
		} else {
			return 1;
		}
	}
	
	public int descSinger() {
		Collections.sort(list);
		if(list.isEmpty()) {
			return 0;
		} else {			
			return 1;
		}
	}
}
