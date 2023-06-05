package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		if(lottery.contains(l)) {
			return false;
		} else {
			lottery.add(l);
			return true;
		}
	}
	
	public boolean deleteObject(Lottery l) {
		System.out.println(lottery);
		if(lottery.contains(l)) {
			lottery.remove(l);
			if(win.contains(l)) {
				win.remove(l);
			}
			return true;
		} else {
			return false;
		}
	}
	
	public HashSet<Lottery> winObject() {
		if(lottery.size()>=4) {			
			Random rd = new Random();
			win.clear();
			ArrayList<Lottery> winLottery = new ArrayList<>();
			ArrayList<Lottery> num = new ArrayList<>();
			winLottery.addAll(lottery);
			for(int i=0; i<4; i++) {
				while(true) {
					num.add(winLottery.get(rd.nextInt(4)));
					if(win.contains(num.get(i))) {
						num.remove(i);
					} else {
						win.add(num.get(i));
						break;
					}
				}
			}
			return win;
		} else {
			System.out.println("당첨 대상자가 4명 미만 입니다.");
			win.clear();
			return win;
		}
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> treeSet = new TreeSet<>();
		treeSet.addAll(win);
		return treeSet;
	}
	
	public boolean searchWinner(Lottery l) {
		for(int i=0; i<lottery.size(); i++) {
			if(lottery.contains(l)) {
				return true;
			}
		}
		return false;
	}
}
