package com.kh.practice.map.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.isEmpty() || map.containsKey(id)==false) {			
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String login(String id, String password) {
		String result = null;
		if(map.containsKey(id)==true && map.get(id).getPassword().equals(password)) {
			result = map.get(id).getName();
			return result;
		} else {
			return result;
		}
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)==true && map.get(id).getPassword().equals(oldPw)) {
			Member m = new Member(newPw, map.get(id).getName());
			map.replace(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)==true) {
			Member m = new Member(map.get(id).getPassword(), newName);
			System.out.println("현재 이름은 : "+map.get(id).getName()+" 입니다.");
			System.out.println("변경할 이름은 : "+newName+" 입니다.");
			map.replace(id, m);
			System.out.println("이름 변경에 성공하였습니다.");
		} else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}
	
	public TreeMap<String, String> sameName(String name){
		TreeMap<String, String> tm = new TreeMap<>();
		List<String> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet);
		for(String key : keySet) {
			if(map.get(key).getName().equals(name)) {
				tm.put(key, map.get(key).getName());
			}
		}
		return tm;
	}
}
