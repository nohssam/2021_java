package com.ict12.after;

public class Ex01 {
	// ���θ޼ҵ� : JVM�� ���θ޼ҵ带 ȣ���Ѵ�.
	//              �ڹ����α׷��� �����ϱ� ���ؼ� ���θ޼ҵ� ȣ��(��Ÿ�� ����Ʈ)
	public static void main(String[] args) {
	// �ڷ��� (������ Ÿ��) : �ڹٿ��� �ڷḦ �з��ϰ� ó���ϴ� ��
	//   1. �⺻�ڷ��� : �����Ϸ����� ó���Ǵ� �ڷ���
    //                   boolean, char, byte,short, int,long, float, double
	//   2. �����ڷ��� : Ŭ������ �ڷ������� ���
	//                    ���� ��ǥ���� ���� String�̴�.
	
		// boolean : ������  => true �Ǵ� false �� ����
		boolean b1 = true;
		boolean b2 = false;
		
		// char : �� ���ڸ� ���� (����ɶ� ���ڷ� ����ȴ�.)
		//        �ݵ�� Ȭ����ǥ�� ���
		//        ���ڷ� ����Ǳ� ������ ���� ����
		//        ���ڷ� ��������� ȣ���ϸ� �ٽ� ���ڷ� ���´�.
		char c1 = 'a';           // c1�� a�� ������ �ִ� 97�� ����ȴ�.
	    char c2  = 97  ;         // c2�� 97 �� ����ȴ�.
	    System.out.println(c1);  // a (ȣ���ϸ� �ٽ� ���ڷ� ���´�)
	    System.out.println(c2);  // a (ȣ���ϸ� �ٽ� ���ڷ� ���´�)
	    
	    // ������ ���� : byte < short < int < long
	    // ������ ������ �⺻ �ڷ����� int �̴�.
	    // ���ǻ��� => byte�� short�� �����ϸ� ������ int �̻�
	    
	    // byte : -128 ~ 127,
	    // short : -32768 ~ 32767 
	    // int �� long�� ������ �ܿ� �ʿ䰡 ����.
	    // ������ �Ϲ����� ������ int �̴�.
	    // long�� ���� �ڿ� L �Ǵ� l �� ���δ�.(��������)
	    int s1 = 12 ;
	    long s2 = 12L ;
	    long s3 = 12 ;
	    // int s4 = 12L; �����߻�
	    
	    // �Ǽ��� ���� : float ,double 
	    // �Ǽ����� �⺻�ڷ����� double �̴�.
	    // float�� ���� �ڿ� F �Ǵ� f�� ���δ�.(�����ϸ� ����)
	    
	   // float k1 = 12.4 ; �����߻�
	    float k2 = 12.4f ;
	    
	    double k3 = 12.4 ;
	    double k4 = 12.4f ;
	    
	   // ** ���ڴ� �����ڷ������� ū�ڷ������� ����Ǵ� ���� ���� ����(���θ��, �ڵ�����ȯ)
	   //    �ݴ�� ū�ڷ������� ���� �۷������� ����ɶ� ���� �߻�
	   //    �̷��� ������ �߻��ϸ� ������ ����ȯ�� �ؼ� ������ ���ش�.(����, ��������ȯ)
	   //    ���� ; char < int < long < float < double
	   // ���� ����ȯ��  ���� �ڷ����� �������� �����.
	    
	    int s4 = (int)(12L);   
	    float k1 = (float)12.4 ;
	    
	  // �����ڷ��� : Ŭ������ �ڷ������� ����� �� 
	  //              ���� ��ǥ���� �ڷ����� String
	   
	   String str1 = "���ѹα�";
	   
      // String �ڷ������� + ���� : 
	  //   -,*,/ ������ ����.
	  //   ������ ���ϱ��ϴ� ������ �ƴϴ�.
	  //   ���ڿ��� ���ڿ��� �����ϴ� �������̴�.
	  //   ���ڿ��� + ������ �ϸ� ������ ���ڿ��� �ȴ�.  
	   
	  String str2 = "1000";
	  int s5  = 1000;
	  System.out.println(str2 + 1000); // �����ϴ� ������ �Ѵ�.
	  System.out.println(s5+ 1000);    // ������ ���Ѵ�.
		
	}
}







