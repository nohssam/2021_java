package com.ict12.after;

public class Ex11 {
	public static void main(String[] args) {
		// 중첩 while : while문 안에 while문 
		
		// 구구단-1
		int i = 2 ;
		while (i<10) {
			int j = 1;
			while(j<10) {
				System.out.println(i + "*" + j + "=" + (i*j) + " ");
				j++;
			}
			i++;
		}
		
		// 구구단-2
		int i2 = 2 ;
		while (i2<10) {
			int j2 = 1;
			while(j2<10) {
				System.out.print(i2 + "*" + j2 + "=" + (i2*j2) + " ");
				j2++;
			}
			System.out.println();
			i2++;
		}
		System.out.println("==============");
		
		// 구구단-3 ;
		int i3 = 1 ;
		while (i3<10) {
			int j3 = 2;
			while(j3<10) {
				System.out.print(j3 + "*" + i3 + "=" + (i3*j3) + " ");
				j3++;
			}
			System.out.println();
			i3++;
		}
	}
}
