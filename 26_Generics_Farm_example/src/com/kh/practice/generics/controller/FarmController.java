package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		if(hMap.isEmpty() || hMap.containsKey(f)==false) {
			hMap.put(f, amount);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)==true) {
			hMap.remove(f);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)==true) {
			hMap.put(f, amount);
			return true;
		} else {
			return false;
		}
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		Set<Farm> setFarm = hMap.keySet();
		for(Farm ff : setFarm) {
			if(ff.equals(f)) {
				list.add(f);
				hMap.put(f, hMap.get(f)-1);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		return true;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
