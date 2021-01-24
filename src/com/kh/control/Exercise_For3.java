package com.kh.control;

import java.util.Scanner;

public class Exercise_For3 {
	public static void main(String []args) {
		// 수를 입력 받아
		// *
		// **
		// *** 과 같이 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
	    	}
		//     *
		//    **	
		//   ***
	    //  ****
	    // *****
			
			for(int i = 0; i < 5; i++) {
				// i 값에 따라서 변수가 j인 for문의 조건식의 최댓값이
				// 점점 줄어들게 된다.
				for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
				}
				for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
	    	}
		}
	}

