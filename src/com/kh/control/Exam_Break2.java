package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String []args) {
		//1���� ����ڰ� �Է��� ���ڱ����� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum =0;
		int i=0;
		// boolean check = true;
		while(true) {
			sum +=i;
			if(i == num)
				// check = false;
				break;
			i++;
		}
		System.out.println("1���� "+num+"������ �� : "+ sum);
	}
}
