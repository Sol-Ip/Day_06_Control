package com.kh.control;

import java.util.Scanner;

public class Exercise_For3 {
	public static void main(String []args) {
		// ���� �Է� �޾�
		// *
		// **
		// *** �� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է����ּ��� : ");
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
				// i ���� ���� ������ j�� for���� ���ǽ��� �ִ���
				// ���� �پ��� �ȴ�.
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

