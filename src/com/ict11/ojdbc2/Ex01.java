package com.ict11.ojdbc2;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex02 ex02 = new Ex02();
		esc:while(true) {
			// book���̺��� ��ü ���� ���� 
			ArrayList<VO>  list =  DAO.getInstance().getList();
			ex02.prn(list);
			
			System.out.println("=================================");
			System.out.println("������ �����ϼ���");
			System.out.println("1.�����ϱ�");
			System.out.println("2.�����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.�˻��ϱ�");
			System.out.print("���ù�ȣ : ");
			String su = scan.next();
			switch (su) {
			case "1":
				System.out.print("bookid : ");
				int i_bookid = scan.nextInt();
				
				System.out.print("bookname : ");
				String i_bookname = scan.next();
				
				System.out.print("publisher : ");
				String i_publisher = scan.next();
				
				System.out.print("price : ");
				int i_price = scan.nextInt();
				
				// �����ϴ� �޼ҵ� ȣ��
				int res1 = DAO.getInstance().getInsert(i_bookid, i_bookname, i_publisher, i_price);
				if(res1>0) {
					System.out.println("���Լ���");
				}
				break;
			case "2":
				System.out.print("������ bookid : ");
				int d_bookid = scan.nextInt();
				
				// ������ �޼ҵ� ȣ��
			    int res2 = DAO.getInstance().getDelete(d_bookid);
			    if(res2>0) {
					System.out.println("��������");
				}
				break;
			case "3":
				System.out.print("bookid : ");
				int u_bookid = scan.nextInt();
				
				System.out.print("bookname : ");
				String u_bookname = scan.next();
				
				System.out.print("publisher : ");
				String u_publisher = scan.next();
				
				System.out.print("price : ");
				int u_price = scan.nextInt();
				
				// ������ �޼ҵ� ȣ��
				 int res3 = DAO.getInstance().getUpdate(u_bookid,u_bookname,u_publisher,u_price);
				 if(res3>0) {
						System.out.println("��������");
				  }
				break;
			case "4":
				System.out.print("�˻��� bookid : ");
				int s_bookid = scan.nextInt();
				
				// �˻��� �޼ҵ� ȣ��
				ArrayList<VO> list2 = DAO.getInstance().getSelectOne(s_bookid);
				ex02.prn(list2);
				break;
			}
			while(true) {
				System.out.print("����ұ��(y/n)? ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		
		System.out.println("���� ����� ���� �Դϴ�."); 
		ArrayList<VO>  list =  DAO.getInstance().getList();
		ex02.prn(list);
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
