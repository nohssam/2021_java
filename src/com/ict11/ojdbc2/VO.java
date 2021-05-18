package com.ict11.ojdbc2;

// VO (Value Object)  : ������ �� ��ü�� �ǹ��ִ� ���� ��� �ִ� ��ü   
//                      DTO�� ������ �����̳� �������� Read-Only �Ӽ� ��ü�̴�.

// DTO(Data Transfer Object) : ���۵Ǵ� �������� ������ ���� ��ü
public class VO {
    // VO ������  DB�� �÷���� �ڷ����� ���� �����.
	int bookid, price ;
	String bookname, publisher ;
	
	// �ʿ��� ������ ���� ������
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
