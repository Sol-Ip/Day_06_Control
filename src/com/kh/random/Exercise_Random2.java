package com.kh.random;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2 {
	 // ����/����/��
	 // ���ڸ� �����ϼ��� (1.���� /2.���� / 3.�� ) : 1
	 // ����� ������ �½��ϴ�.
	 // ��ǻ�ʹ� ������ �½��ϴ�.
	 // ��ǻ�Ͱ� �¸��Ͽ����ϴ�. loser!
	
	 // ����/����/��
	 // ���ڸ� �����ϼ��� (1.���� /2.���� / 3.�� ) : 2
	 // ����� ������ �½��ϴ�.
	 // ��ǻ�ʹ� ������ �½��ϴ�.
	 // �����ϴ�!!
	
	 // ����/����/��
	 // ���ڸ� �����ϼ��� (1.���� /2.���� / 3.�� ) : 3
	 // ����� ���� �½��ϴ�.
	 // ��ǻ�ʹ� ������ �½��ϴ�.
	 // �÷��̾ �¸��Ͽ����ϴ�! 
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			
			System.out.print("���ڸ� �����ϼ���(1.���� /2.���� / 3.�� ) : ");
			int com = rand.nextInt(3) + 1;
			int user = sc.nextInt();
			
			if (!(user > 0 && user <4)) {
				System.out.println("1~3 ������ ���ڸ� �Է����ּ���.");
				continue;
			}
			// 1~3 ������ ���� , 0~2 + 1 -> 1~3
			
			
			// ���
			System.out.println("===== ��� =====");
			
			// �÷��̾�� ������ �´°�
			switch(user) {
			  case 1:
				System.out.println("����� ������ �½��ϴ�.");
				break;
			  case 2:
				System.out.println("����� ������ �½��ϴ�.");
				break;
			  case 3:
				System.out.println("����� ���� �½��ϴ�.");
				break;
		    	}
	
			// ��ǻ�ʹ� ������ �´°� ���
			switch(com) {
			  case 1:
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				break;
			  case 2:
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				break;
			  case 3:
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				break;
		    	}		
			System.out.println("================");
			
			// ���� ��� 
			// �÷��̾ �¸��� ���
			// ���� / ���� / �� <=> �� / ���� / ����
			if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2 ) {
				System.out.println("�÷��̾ �¸��Ͽ����ϴ�.");
				
			} else if (user == com ) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");
			}
			
			// �÷��̾ �¸��Ͽ����ϴ�.
			// or �����ϴ�.
			// or ��ǻ�Ͱ� �¸��Ͽ����ϴ�.
		}
	}
		 
 }
	
