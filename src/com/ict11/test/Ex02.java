package com.ict11.test;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("��ȣ : "); 
			int no = scan.nextInt(); 
			System.out.print("���� : "); 
			int kor = scan.nextInt(); 
			System.out.print("���� : "); 
			int eng = scan.nextInt(); 
			System.out.print("���� : "); 
			int math = scan.nextInt(); 
			int sum = kor + eng + math; 
			int avg = sum / 3 ; 
			int hak = 0 ; 
			
			if(avg>=90) { 
				hak = 'A'; 
			}else if(avg>=80) {
				hak = 'B';
			}else if(avg >=70) {
				hak = 'C';
			}else { 
				hak = 'F'; 
			}
			int rank = 1 ;
			
			int[] person = new int[5];
			person[0] = no;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			
			arr[i] = person;
		}
		
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j) continue;
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		} 
		// ����
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		
    	// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		
		
		
	}
}