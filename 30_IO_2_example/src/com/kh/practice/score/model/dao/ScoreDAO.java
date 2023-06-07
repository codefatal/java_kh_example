package com.kh.practice.score.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		String filePath = "score.out";
		int[] score = {kor, eng, math, sum};
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(filePath);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			dos.writeUTF(name);
			for(int i=0; i<4; i++) {
				dos.writeInt(score[i]);
			}
			dos.writeDouble(avg);
			dos.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null) dos.close();
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
		String filePath = "score.out";
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		return dis;
	}
}
