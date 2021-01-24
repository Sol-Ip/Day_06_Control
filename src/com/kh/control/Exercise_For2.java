package com.kh.control;

public class Exercise_For2 {
	// 중첩 For 문, 별찍기

	public static void main(String [] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		
		for (int i = 0; i < 10; i++) {
			//System.out.println("*****"); <- For 문으로 대체
			for (int j = 0; j < i+1; j++) { //<<-첫번째부터 *이 출력됨
				System.out.print("*");
			}
			System.out.println();
			
		}
	
		System.out.println("1=========================");
		// *****
		// *****
		// *****
		// *****
		// *****
		System.out.println();
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("2=========================");	
		// **********
		// *********
		// ********	
		// *******	
		// ******
		// *****
		// ****
		// ***
		// **
		// *
		System.out.println();
		for ( int i = 10; i > 0; i--) {
			for(int j = i; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		   }
		
		//Ctrl + shift + _(언더바) => 파일 내에서 창 나누기
		System.out.println("3=========================");	
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		// *********
		// ********	
		// *******	
		// ******
		// *****
		// ****
		// ***
		// **
		// *
		System.out.println();
		for (int i = 0; i<10; i++) {
			for(int j = 0; j< i+1; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		
		for (int i = 10-1; i > 0; i--) {
			for (int j = i; j > 0; j--) {		
			System.out.print("*");
			}
			System.out.println();
			}

		System.out.println("4=========================");	
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		// *********
		// ********	
		// *******	
		// ******
		// *****
		// ****
		// ***
		// **
		// *
		System.out.println();
		
		for (int i = 0; i<10; i++) {
			for(int j = 0; j< i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		for (int i = 10-1; i > 0; i--) {
//			for(int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
			for (int j=0; j < i ; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	  } 
	}

