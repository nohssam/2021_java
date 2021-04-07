package com.ict06.Thread;
// 두개의 스레드를 생상하여 첫번째 스레드의 출력을 1-50까기 출력하고, 
// 두번째 스레드의 출력을 51-100까기 출력하고,
// 다시 첫번째 스레드가 101-150까지 출력, 
// 두번째 스레드가 151-200까지 출력(synchronized, wait, notify 사용)
public class Ex16 implements Runnable {
	
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + (++x));
			if(x==50 || x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(x==51 || x==101) {
				notify();
			}
		}
	}
}
