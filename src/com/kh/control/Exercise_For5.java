package com.kh.control;

public class Exercise_For5 {
	// 0�� 0�� ���� 23�� 59�б��� ����ϱ� 
	public static void main(String []args) {
		
		for (int i=0; i<24; i++) {
			for (int j=0; j<60; j++) {
//				System.out.println(i+"�� "+j+"��");
				System.out.printf("%2d�� %2d��\n", i, j);
				// \n �� ����� �Ǵ� �κ��� �������� 
			}
		}
	}
}
