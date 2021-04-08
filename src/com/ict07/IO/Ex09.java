package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// c:\\study\\util\\test100.txt 파일안에 
		//  이름 : 000
		//  나이 : 00 
		//  전화번호 : 000-0000-0000를
		//  작성하는 코딩을 하시오 
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"test100.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 노종문\n나이 : 12\n전화번호 : 010-9732-9110";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
