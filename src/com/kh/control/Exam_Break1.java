package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	// Break문은 가장 가까운 반복문을 빠져나가는 문구
	// 중첩 for문 두개를 빠져 나오게 하려면 2개의 break 필요
	
	// 문자열을 입력 받아 글자 갯수를 출력하는 프로그램
	// 단, "end"가 입력되면 반복을 종료함 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			if(str.equals("end"))
				break;
			System.out.println("글자 갯수 : " + str.length());
		}
	}
}
