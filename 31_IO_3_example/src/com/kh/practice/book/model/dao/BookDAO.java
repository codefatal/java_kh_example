package com.kh.practice.book.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr){
		String filePath = "book.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath, true);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			for(int i=0; i<bArr.length; i++) {	
				if(bArr[i]!=null) {					
					oos.writeObject(bArr[i]);
					System.out.println(bArr[i]);
				} else {
					continue;
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}


	public Book[] fileRead() {
		String filePath = "book.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(filePath);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			for(int i=0; i<bArr.length; i++) {
				if(bArr[i]!=null) {
					bArr[i] = (Book)ois.readObject();
				} else {
					continue;
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch(EOFException e) {
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		return bArr;
	}
}
