package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	// Break���� ���� ����� �ݺ����� ���������� ����
	// ��ø for�� �ΰ��� ���� ������ �Ϸ��� 2���� break �ʿ�
	
	// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� ���α׷�
	// ��, "end"�� �ԷµǸ� �ݺ��� ������ 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			if(str.equals("end"))
				break;
			System.out.println("���� ���� : " + str.length());
		}
	}
}
