package com.kh.random;

import java.util.Random;

public class Exam_Random1 {
	public static void main(String []args) {
		Random rand = new Random();
		for (int i = 0; i<10; i++) {
			
			// nextInt(n) -> 0���� n-1������ ������ �� 
			// nextInt(10) -> 0���� 10-1������ ������ �� 
			System.out.println("0���� 9������ ������ �� : " + rand.nextInt(10));
			System.out.println();
		}
		
		
			// 1���� 10������ ������ �� 
			// nextInt(10) -> 0~9, +1 -> 1~10 ������ ������ ��
		for (int i = 0; i<10; i++) {	
		System.out.println("1���� 10������ ������ �� : " + (rand.nextInt(10) + 1));
		}
		
		System.out.println();
			// 20~35������ ������ �� 
			// 0~15 -> rand.nextInt(16)+20
		for (int i=0; i<10; i++) {
			System.out.println("20���� 35������ ������ �� : " + (rand.nextInt(16)+20));
		}
	}

}
