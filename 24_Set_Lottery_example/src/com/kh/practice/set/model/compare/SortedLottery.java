package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;


public class SortedLottery implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		double o1name = ((Lottery)o1).getName().hashCode();
		double o2name = ((Lottery)o2).getName().hashCode();
		double o1phone = ((Lottery)o1).getPhone().hashCode();
		double o2phone = ((Lottery)o2).getPhone().hashCode();
		if(o1name==o2name) {			
			return Double.compare(o1phone, o2phone);
		}
		return Double.compare(o1name, o2name);
	}
}
