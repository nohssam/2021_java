package com.ict12.after;

public class Ex04 {
	public static void main(String[] args) {
		// �ܼ� if�� : ���ǽ��� ���϶��� �����Ѵ�.
		//              �����϶��� if�� ����
		// ���� : if(���ǽ�){
		//          ���ǽ��� ���϶� ������ ���� ;
		//          ���ǽ��� ���϶� ������ ���� ;
		//         }
		//        ��, ������ ������ �� ���̸� { } (���) ���� ����
		
		// double avg �� 60�̻��̸� �հ�, �ƴϸ� ���հ�
		double avg = 50;
		String res = "�ʱⰪ"; 
		if(avg >=60) {
			res = "�հ�";
		}
		if(avg<60) {
			res = "���հ�";
		}
		System.out.println(res);
		System.out.println("======================");
		
		String res2 = "���հ�"; // ������ ���� �ƴ� �Ϳ� ���� ����� �ʱⰪ�� �ִ´�.
		if(avg >=60) {
			res2 = "�հ�";
		}
		System.out.println(res2);
		System.out.println("======================");
		
		// int k1 �� Ȧ������ ¦������ �Ǻ����� 
		int k1 = 46;
		String res3 = "Ȧ��";
		if(k1%2==0) {
			res3 = "¦��";
		}
		System.out.println(res3);
		
		
	}
}










