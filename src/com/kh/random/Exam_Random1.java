package com.kh.random;

import java.util.Random;

public class Exam_Random1 {
	public static void main(String []args) {
		Random rand = new Random();
		for (int i = 0; i<10; i++) {
			
			// nextInt(n) -> 0부터 n-1까지의 랜덤한 수 
			// nextInt(10) -> 0부터 10-1까지의 랜덤한 수 
			System.out.println("0부터 9까지의 랜덤한 수 : " + rand.nextInt(10));
			System.out.println();
		}
		
		
			// 1부터 10까지의 랜덤한 수 
			// nextInt(10) -> 0~9, +1 -> 1~10 사이의 랜덤한 수
		for (int i = 0; i<10; i++) {	
		System.out.println("1부터 10까지의 랜덤한 수 : " + (rand.nextInt(10) + 1));
		}
		
		System.out.println();
			// 20~35까지의 랜덤한 수 
			// 0~15 -> rand.nextInt(16)+20
		for (int i=0; i<10; i++) {
			System.out.println("20부터 35까지의 랜덤한 수 : " + (rand.nextInt(16)+20));
		}
	}

}
