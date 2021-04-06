package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 상속받은 클래스 : HashSet, TreeSet
		// - HashSet과 TreeSet 사용방법은 모두 같다. 
		//    그러나 TreeSet은 내부에서 항상 오름 차순 정렬 상태를 유지한다.
		//    set은 특정 기준으로 정렬을 할 수 없다.
		//  - HashSet, TreeSet 모두 중복 안됨 (오류 안남)
		
		// 컬렉션 생성
		// HashSet<제네닉타입=객체타입=같은클래스> 참조변수 = new HashSet<제네닉타입>();
		// HashSet<제네닉타입=객체타입=같은클래스> 참조변수 = new HashSet<>();
		HashSet<String> h1 = new HashSet<>();  // 문자열형 객체 모임
	    HashSet<Integer> h2 = new HashSet<>(); // 정수형 객체 모임
	    HashSet<Double> h3 = new HashSet<>();  // 실수형 객체 모임
	    HashSet<Boolean> h4 = new HashSet<>(); // 논리형 객체 모임
	    
	    // h2 (정수형)에 객체를 추가하는 방법
	    // 방법1) 기본자료형을 객체로 만들어서 넣기 => Boxing
	       Integer k1 = new Integer(10);
	       Integer k2 = new Integer("10");
	       
	    // 방법2) 기본자료형을 그냥 넣는다. 
	    //        기본자료형이 자동으로 객체가 되어서(AutoBoxing) 넣어진다.
	       
	    // h2 컬렉션에 객체 넣기 (add(요소))
	       h2.add(k1);          	// true
	       h2.add(k2);          	// false (이유: 중복을 허용하지 않음)
	       h2.add(10); // 방법2 	// false 
	       h2.add(new Integer(10)); // false
	    // h2.add('A'); // 같은 제네닉 타입이 아니면 무조건 오류
	       
	       h3.add(3.14);
	       h3.add(new Double(31.4));
	    // h3.add(14); // 같은 제네닉 타입이 아니면 무조건 오류
	       
	       
	    // 내용 보기 (전체 내용 보기) => 배열처럼 보이고 있음 
	       System.out.println(h1);
	       System.out.println(h2);
	       System.out.println(h3);
	       
	       h1.add("java");   
	       h1.add("Java");
	       h1.add("JAVA");
	       h1.add("jsp");
	       h1.add("JSP");
	       h1.add("spring");
	       System.out.println(h1);
	      
	       // 하나씩 꺼내서 사용하기
	       // 1. 개선된 for문(일반 for문은 사용 못함 (인덱스가 없음))
	       // 2. iterator()
	       for (String k : h1) {
			  String msg = k ;
			  System.out.println(msg);
		   }
	       System.out.println("================");
	       Iterator<String> it = h1.iterator();
	       while (it.hasNext()) {  // hasNext():다음 객체가 존재하면 true,존재하지 않으면 false
			String msg = (String) it.next(); // next(): 다음객체를 return하고 다음객체로 이동
			System.out.println(msg);
		}
		
	}
}
