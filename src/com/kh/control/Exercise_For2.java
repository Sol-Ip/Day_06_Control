package com.kh.control;

public class Exercise_For2 {
	// ��ø For ��, �����

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
			//System.out.println("*****"); <- For ������ ��ü
			for (int j = 0; j < i+1; j++) { //<<-ù��°���� *�� ��µ�
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
		
		//Ctrl + shift + _(�����) => ���� ������ â ������
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

