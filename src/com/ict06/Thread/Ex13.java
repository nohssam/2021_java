package com.ict06.Thread;

public class Ex13 implements Runnable {
	// 임계영역 : 멀티스레드에서 공통으로 사용되는 영역
	//            현재 실행 중인 스레드가 순식간에 다른 스레드에게 
	//            제어권을 빼앗기는 문제가 발생한다.
	//            이를 해결하기 위한 방법이 동기화 처리이다.
	// 동기화처리 : 임계영역에 sysnchronized 예약어를 사용하면 된다.
	//              그러면 현재 실행중인 스레드가 끝날때 까지 임계영역에 
	//              다른 스레드가 접근해서 제어권을 빼았을 수 없다.
	
	@Override
	public synchronized void run() {
		int x = 0 ;
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
		}
	}
}
