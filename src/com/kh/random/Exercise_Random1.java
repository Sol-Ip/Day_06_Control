package com.kh.random;

import java.util.Random;
import java.util.Scanner;

// ���� �� �� ���߱� ����
// ���ڸ� �Է� (1. �ո� / 2. �޸�) : 1
// ������ϴ�.

// ���ڸ� �Է� (1. �ո� / 2. �޸�) : 2
// ��! Ʋ�Ƚ��ϴ�.
// ���� �Ǿ��ִ� ���ڴ� �������� ������ ����
// ����ڰ� �Է��� ���� �� �� ����� ���
// 1 �Ǵ� 2 �̿��� ���� �Է��� ���� ��� "�ٽ� �Է��ϼ���"�� ��� (continue �̿�)

public class Exercise_Random1 {
	public static void main(String []args) {
		// ���� ����
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== ���� ��/�� ���߱� ���� =====");
			int com = rand.nextInt(2)+1;
			
			// ����� �Է�
			
			System.out.print("���ڸ� �Է����ּ��� (1.�ո� / 2.�޸�) : ");
			int num = sc.nextInt();

			if (!(num > 0 && num < 3)) {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
			// ������ �Է°� ��
			// ���
			if (num == com) {
				System.out.println("������ϴ�!");
			} else {
				System.out.println("��! Ʋ�Ƚ��ϴ�.");
			}
		}
	}
}
	
		
		
		// ���
		


