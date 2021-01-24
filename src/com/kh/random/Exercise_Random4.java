package com.kh.random;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random4 {
	// UP & DOWN ����
	// �� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.
	// 0�� �Է��ϸ� ������ �����մϴ�.
	// ���ڸ� �Է����ּ��� (user) : 55
	// UP!
	// ���ڸ� �Է����ּ��� (com) : 35
	// UP!
	// ���ڸ� �Է����ּ��� (user) : 66
	// DOWN!
	// ���ڸ� �Է����ּ��� (com) : 22
	// DOWN!
	// ���ڸ� �Է����ּ��� (user) : 64
	// ������ ������ 3������ ������ϴ�!
	
	public static void main (String[]args) {

		System.out.println("=== UP & DOWN ���� ===");
		System.out.println("�� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.");
		System.out.println("0�� �Է��ϸ� ������ �����մϴ�.");
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// ����� �ϰ� ��ǻ�� ���� �Ǵ�
		boolean check = true;
		int compareNum = 0;
		int turnCheck = 0;
		String turnName = "";
		int answerCount = 0;
		
		int goalNum = 0;
		
	while (true) {	
		// ������ ���� �� �ٽ� ���ڸ� �̾Ƽ�
		// ������ ����ǵ��� ��
		if (check) {
			goalNum = rand.nextInt(100)+1;
			check = false;
			turnCheck = 0;
	    	}
		
		// flag ������ �̿��Ͽ� 
		// ����� ����, ��ǻ�� ���ʸ� �����ư��鼭 �����ϵ��� ��.
		// ���ʿ� ���� ���� turnCheck ��� 		
		if (turnCheck == 0) {
		System.out.println("<<User Trun>>");
		System.out.print("���ڸ� �Է����ּ���(user) : " );	
		int userNum = sc.nextInt();
		compareNum = userNum;
		turnCheck = 1; // ��ǻ�� ������ �ٲ�
		} else {
		
		System.out.println("<<Computer Trun>>");
		int comNum = rand.nextInt(100)+1;
		System.out.println("���ڸ� �Է����ּ���(com) : " + comNum);	
		compareNum = comNum;
		turnCheck = 0 ; // ����� ������ �ٲ� 
		}
			// ���߷��� ���ڿ� ��
			// ���߷��� ���ڰ� ũ�� up
			if (goalNum > compareNum) { // �� ���� ����ڰ� �������, �� ���� ��ǻ�Ͱ� �������
				System.out.println("UP!!!!");
				answerCount++;
				continue;
				
			  } else if (goalNum < compareNum) {
				System.out.println("DOWN!!!!");
				answerCount++;
				continue;
				
			  } else {
					// ���� ��� 
				  	// ������ ������ n�� ���� ������ϴ� !!
			    	// ������ ��� turnName = "����";
				  	// ��ǻ���� ��� turnName = "��ǻ��";
				  
				    if (turnCheck == 1) { // turnCheck ���� 0���� 1�� ��
				    	// ������ ���
				    	turnName = "user";
				    } else if (turnCheck == 0) { //turnCheck ���� 1���� 0�� ��
				    	turnName = "computer";
				    }
				System.out.println(turnName + "�� ������ "+ answerCount + "�� ���� ������ϴ�!");
				check = true;
				answerCount = 1;
			  }
			}	
		}
	}


