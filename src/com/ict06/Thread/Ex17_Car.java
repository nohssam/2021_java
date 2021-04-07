package com.ict06.Thread;

import java.util.ArrayList;
import java.util.List;

public class Ex17_Car {
	// �÷��� : �ڵ������� �����ϴ� ���� â��
	private List<String> carList = null;
	
	// ������ : �ش� Ŭ������ ��ü�� �����Ǹ� carList�� �����Ѵ�.
	public Ex17_Car() {
		carList = new ArrayList<String>();
	}
	
	// �������� �ڵ��� ����
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
			case 0: carName = "SM5"; break;
			case 1: carName = "SM6"; break;
			case 2: carName = "SM7"; break;
		}
		return carName ;
	}
	
	// �Һ��ڰ� �ڵ����� ��� �޼ҵ�
	public synchronized String pop() {
		String carName = null;
		// ��� ������ 
		if(carList.size() == 0 ) {
			System.out.println("���� ���׿�. ������ ������ ��ٷ� �ּ���");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// ��� ���� ���� carList���� ���� ���߿� �� ���� �Ǹ�(����)
		carName = carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�. �Ǹ��� ���� "+carName + "\n");
		return carName;
	}
	
	// �ڵ����� carList�� �ֱ� 
	// â�� �ڵ��� 5�밡 �Ǹ� �Һ��ڵ鿡�� �Ǹ��� �����Ѵ�. 
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("�ڵ����� ���� â�� ���� : " + car);
		
		if(carList.size() == 5) {
			// ��� 0�϶� ����Ų �����带 �غ���·� �����Ų��.
			notify();
		}
	}
	
}








