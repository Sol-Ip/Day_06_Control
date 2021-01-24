package com.kh.random;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random4 {
	// UP & DOWN 게임
	// 이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.
	// 0을 입력하면 게임을 종료합니다.
	// 숫자를 입력해주세요 (user) : 55
	// UP!
	// 숫자를 입력해주세요 (com) : 35
	// UP!
	// 숫자를 입력해주세요 (user) : 66
	// DOWN!
	// 숫자를 입력해주세요 (com) : 22
	// DOWN!
	// 숫자를 입력해주세요 (user) : 64
	// 유저가 정답을 3번만에 맞췄습니다!
	
	public static void main (String[]args) {

		System.out.println("=== UP & DOWN 게임 ===");
		System.out.println("이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.");
		System.out.println("0을 입력하면 게임을 종료합니다.");
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 사용자 턴과 컴퓨터 턴을 판단
		boolean check = true;
		int compareNum = 0;
		int turnCheck = 0;
		String turnName = "";
		int answerCount = 0;
		
		int goalNum = 0;
		
	while (true) {	
		// 정답을 맞춘 후 다시 숫자를 뽑아서
		// 게임이 진행되도록 함
		if (check) {
			goalNum = rand.nextInt(100)+1;
			check = false;
			turnCheck = 0;
	    	}
		
		// flag 변수를 이용하여 
		// 사용자 차례, 컴퓨터 차례를 번갈아가면서 동작하도록 함.
		// 차례에 대한 변수 turnCheck 사용 		
		if (turnCheck == 0) {
		System.out.println("<<User Trun>>");
		System.out.print("숫자를 입력해주세요(user) : " );	
		int userNum = sc.nextInt();
		compareNum = userNum;
		turnCheck = 1; // 컴퓨터 턴으로 바꿈
		} else {
		
		System.out.println("<<Computer Trun>>");
		int comNum = rand.nextInt(100)+1;
		System.out.println("숫자를 입력해주세요(com) : " + comNum);	
		compareNum = comNum;
		turnCheck = 0 ; // 사용자 턴으로 바꿈 
		}
			// 맞추려는 숫자와 비교
			// 맞추려는 숫자가 크면 up
			if (goalNum > compareNum) { // 한 번은 사용자가 맞췄는지, 한 번은 컴퓨터가 맞췄는지
				System.out.println("UP!!!!");
				answerCount++;
				continue;
				
			  } else if (goalNum < compareNum) {
				System.out.println("DOWN!!!!");
				answerCount++;
				continue;
				
			  } else {
					// 정답 출력 
				  	// 유저가 정답을 n번 만에 맞췄습니다 !!
			    	// 유저인 경우 turnName = "유저";
				  	// 컴퓨터인 경우 turnName = "컴퓨터";
				  
				    if (turnCheck == 1) { // turnCheck 값이 0에서 1이 됨
				    	// 유저인 경우
				    	turnName = "user";
				    } else if (turnCheck == 0) { //turnCheck 값이 1에서 0이 됨
				    	turnName = "computer";
				    }
				System.out.println(turnName + "가 정답을 "+ answerCount + "번 만에 맞췄습니다!");
				check = true;
				answerCount = 1;
			  }
			}	
		}
	}


