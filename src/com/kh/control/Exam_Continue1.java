package com.kh.control;

public class Exam_Continue1 {
	// Continue�� �ݺ��� �ȿ��� ��� �����ϸ�,
	// continue�� ������ �Ǹ� ������ ������
	// �������� �ʰ� �ٷ� ������ ���� ���� ������ 
	// �ǳ� �ٶ�� �ǹ�
	// ex) 1~10 ������ �� �߿��� 3�� ����� �����ϰ� ����Ͻÿ� 
	public static void main(String []args) {
		
		for (int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 1���� 100������ �������� ���� ����ϴµ� 
		// 4�� ����� �����ϰ� ����Ͻÿ�
		int sum = 0;
		for (int  i = 1; i <= 100; i++) {
			if(i % 4 == 0)
			continue;
			sum += i;
		}
		System.out.println("�� : "+sum);
		
		System.out.println();
		System.out.println();
		
		// 2~9�ܱ��� �������� ��� �ϴµ�
		// ¦������ ���� �ϰ� ��� �Ͻÿ�.
		// ex)3�� ���� 5���� ��� �ǵ��� �� ��
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 2 = 6
		// ...
		
		// 2 * 1 = 2  3 * 1 = 3  4 * 1 = 4  5 * 1 = 5 ....
		for(int i =1; i < 10 ; i++) {
			for(int j = 2; j < 10 ; j++) { 
			if ( j % 2 == 0)
				continue;
	     		System.out.printf("%d * %d = %d\t", j, i, (j*i)); 	     	
	     		}
			System.out.println();
	       }
	   	}
	}

