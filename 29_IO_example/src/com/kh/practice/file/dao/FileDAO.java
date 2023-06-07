package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		if(f.exists()) {			
			return true;
		} else {
			return false;
		}
	}
	
	public void fileSave(String file, String s) {
		try(
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			) {
			bw.append(s);
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			) {
				String str = br.readLine();
				while(str!=null) {
					sb.append(str+"\n");
					str = br.readLine();
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try(
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			) {
				bw.append(s);
				bw.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
