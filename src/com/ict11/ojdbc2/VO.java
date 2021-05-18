package com.ict11.ojdbc2;

// VO (Value Object)  : 데이터 그 자체로 의미있는 것을 담고 있는 객체   
//                      DTO와 동일한 개념이나 차이점은 Read-Only 속성 객체이다.

// DTO(Data Transfer Object) : 전송되는 데이터의 집합을 가진 객체
public class VO {
    // VO 변수는  DB의 컬럼명과 자료형을 같게 만든다.
	int bookid, price ;
	String bookname, publisher ;
	
	// 필요한 정보를 갖는 생성자
	public VO() {}
	public VO(int bookid, int price, String bookname, String publisher) {
		super();
		this.bookid = bookid;
		this.price = price;
		this.bookname = bookname;
		this.publisher = publisher;
	}

	// getter/settter
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
    
	
}
