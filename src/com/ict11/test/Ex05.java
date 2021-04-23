package com.ict11.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 모든 파일을 복사 및 붙이기 하는 경우 (바이트 스트림)
		Scanner scan = new Scanner(System.in);
		System.out.println("복사장소와 파일명 : ");
		String pathname1 = scan.next();
		System.out.println("붙이기 장소와 파일명 : ");
		String pathname2 = scan.next();

		// 입력(읽기)
		File file1 = new File(pathname1);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		// 출력(쓰기)
		File file2 = new File(pathname2);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			// 그림,소리, 동영상파일들을 처리할때는 무조건 1byte씩처리하자 
			int k = 0 ;
			while ((k = bis.read()) != -1) {
				bos.write(k);
			}
			bos.flush();
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}










