package com.kh.control;

public class Exercise_For6 {
 //구구단 옆으로 출력하기 (2단 옆에 3단)
	// 2단 3단 4단 5단 
	// 2 * 1 = 2   3 * 1 = 3  4 * 1 = 4  5 * 1 = 5
	public static void main(String[] args) {
		System.out.println("================가로 1");
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j < 10; j++) {
//				System.out.print(i+"*"+j+"="+i*j +"\t");
				System.out.printf("%d * %d = %2d\t", j, i, (j*i));
			}
			System.out.println();
		}
		
		System.out.println("================가로 2");
		
		for(int i =1; i <= 9; i++) {
	     	for(int j = 1; j <= 9; j++) {		  
			System.out.print(i+" * "+j+" = "+i*j +" \t");

			}
			System.out.println();
		}
		
		System.out.println("================세로 1");
		
		for (int i=1; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
	}
}