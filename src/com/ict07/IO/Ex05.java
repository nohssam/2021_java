package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 1. FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할 수 있는 스트림
		//   - 생성자 : FileOutputStream(File file), FileOutputStream(File file, boolean append)
		//              FileOutputStream(String name),FileOutputStream(String name, boolean append)
		//       File file , String name => 특정위치 + 파일이름  
		//       boolean append : false or 생략을 하면 덮어쓰기, true을 하면 이어쓰기
		//  - 주요메소드
		//    write(int b)     => 한글자 쓰기 가능(영문자대소문자,숫자,일부특수문자만 가능)	
		//    write(byte[] b)  => 여러글자를 byte[]에 넣어서 쓰기 가능
		//    flush()          => write 후 반드시 실행하자
		//    close()          => open된 스트림 닫기( 사용후 닫기), 보통 finally로 처리
		
		// 특정위치의 파일까지 지정
		String pathname = "C:"+File.separator+"study"+File.separator
							+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			// 기존파일이 있으면 덮어쓰기 하고, 없으면 생성한다.
			fos = new FileOutputStream(file);
			
			// 기존파일이 있으면 이어쓰기 하고, 없으면 생성한다.
			// fos = new FileOutputStream(file, true);
			
			// 한글자 쓰기 
			fos.write(65); // A
			fos.write(97); // a
			
			// int 이기 때문에 char를 사용할 수 있다.
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			fos.write('대'); // 안나옴
			fos.write('한'); // 안나옴
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			// 자바에서 줄변경 13(Carriage return = CR = \r) 이다.
			// 다른 언어중에는 (\r\n(Line feed = 10)를 같이 사용하는 경우도 있다.)
			fos.write(13); 
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			fos.write(b);
			
			// String를 이용하자(영어이외 문자도 가능)
			String str="Hell\r안녕\r123\r大韓";
			byte[] b2 =str.getBytes();
			fos.write(b2);
			
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









