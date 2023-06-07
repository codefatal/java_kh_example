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

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr){
		String filePath = "book.txt";
		try (
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			) {
			for(int i=0; i<bArr.length; i++) {
				if(bArr[i]!=null) {
					oos.writeObject(bArr[i]);
				}
			}
			oos.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public Book[] fileRead() {
		String filePath = "book.txt";
		try (
			FileInputStream fis = new FileInputStream(filePath);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			){
			for(int i=0; i<bArr.length; i++) {
				bArr[i] = (Book) ois.readObject();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return bArr;
	}
}
