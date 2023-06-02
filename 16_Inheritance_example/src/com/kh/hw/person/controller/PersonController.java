package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] result = new int[2];
		for(int i=0; i<s.length; i++) {
			if(s[i]!=null) {
				result[0]++;
			}
		}
		for(int j=0; j<e.length; j++) {
			if(e[j]!=null) {
				result[1]++;
			}
		}
		return result;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		int count = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i] != null) {
				count++;
			} else {
				break;
			}
			
		}
		s[count] = new Student(name, age, height, weight, grade, major);
		System.out.println("등록이 완료되었습니다.");
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		int count = 0;
		for(int i=0; i<e.length; i++) {
			if(e[i] != null) {
				count++;
			} else {
				break;
			}
			
		}
		e[count] = new Employee(name, age, height, weight, salary, dept);
		System.out.println("등록이 완료되었습니다.");
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
