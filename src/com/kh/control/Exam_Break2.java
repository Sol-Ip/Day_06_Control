package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String []args) {
		//1부터 사용자가 입력한 숫자까지의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
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
		System.out.println("1부터 "+num+"까지의 합 : "+ sum);
	}
}
