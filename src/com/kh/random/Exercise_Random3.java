package com.kh.random;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random3 {
	// UP & DOWN ����
	// �� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.
	// 0�� �Է��ϸ� ������ �����մϴ�.
	// ���ڸ� �Է����ּ��� (user) : 55
	// UP!
	// ���ڸ� �Է����ּ��� (user) : 77
	// DOWN!
	// ���ڸ� �Է����ּ��� (user) : 64
	// ������ ������ 2������ ������ϴ�!
	public static void main(String[]args) {
		Random rand = new Random();
		Scanner sc= new Scanner(System.in);
		

			System.out.println("=== UP & DOWN ���� ===");
			System.out.println("�� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.");
			System.out.println("0�� �Է��ϸ� ������ �����մϴ�.");
			int goalNum = rand.nextInt(100)+1;
			int countNum = 0;
			
			while (true) {
				System.out.print("���ڸ� �Է����ּ��� : ");
				int userNum = sc.nextInt();
				countNum++;	//�Է� Ƚ�� ī��Ʈ
				
				// ���߷��� ���ڿ� ��
				// ���߷��� ���ڰ� ũ�� up
				if (goalNum > userNum) {
					System.out.println("UP!");
				  } else if (goalNum < userNum) {
						// ���߷��� ���ڰ� ũ�� up
					System.out.println("DOWN!");
				  } else {
						// ���� ��� 
					System.out.println("������ ������ "+ countNum + "�� ���� ������ϴ�!");
					System.out.println();
					System.out.println();
				}		
			}
		}	
	}

