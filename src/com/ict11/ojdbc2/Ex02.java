package com.ict11.ojdbc2;

import java.util.ArrayList;

// ����� ����ϴ� Ŭ����
public class Ex02 {

	public void prn(ArrayList<VO> list) {
		System.out.println("��ȣ\t���� �̸�\t���ǻ�\t����");
		for (VO k : list) {
			System.out.print(k.getBookid()+"\t");
			System.out.print(k.getBookname()+"\t");
			System.out.print(k.getPublisher()+"\t");
			System.out.println(k.getPrice());
		}
	}
}
