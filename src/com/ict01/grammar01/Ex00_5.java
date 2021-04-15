package com.ict01.grammar01;

public class Ex00_5 {
	// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
	// 형식 : for(초기식; 조건식; 증감식){
	// 조건식이 참일때 실행할 문장;
	// 조건식이 참일때 실행할 문장;
	// }

	// while문 : for문과 같은 반복문
	// 형식1) 								형식2)
	// 초기식; 								초기식;
	// while(조건식){ 						while(true){
	// 조건식이 참일때 실행할 문장; 			** if (빠져나갈조건) break; (먼저탈출)
	// 조건식이 참일때 실행할 문장; 				조건식이 참일때 실행할 문장;
	// 증감식; 									** if (빠져나갈조건) break; (나중탈출)
	// }										} 증감식;
	// ** while문 끝을 만나면 조건식으로 이동하라
	
	// break 문 : 현재 반복문을 탈출 할 때 사용 
	// continue 문 : continue문 이하의 수행문을 포기하고 다음 회차를 반복수행
	
	 // break label : 레이블이 지정한 블록을 탈출한다.
	 //               단순 for문일때는 break와 break label이 같은 효과를 낸다.
     // continue label: 레이블이 지정한 블록의 증감식으로 이동
	 //            단순 for문일때는 continue와 continue label이 같은 효과를 낸다. 
}
