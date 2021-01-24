package com.kh.random;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2 {
	 // 가위/바위/보
	 // 숫자를 선택하세요 (1.가위 /2.바위 / 3.보 ) : 1
	 // 당신은 가위를 냈습니다.
	 // 컴퓨터는 바위를 냈습니다.
	 // 컴퓨터가 승리하였습니다. loser!
	
	 // 가위/바위/보
	 // 숫자를 선택하세요 (1.가위 /2.바위 / 3.보 ) : 2
	 // 당신은 바위를 냈습니다.
	 // 컴퓨터는 바위를 냈습니다.
	 // 비겼습니다!!
	
	 // 가위/바위/보
	 // 숫자를 선택하세요 (1.가위 /2.바위 / 3.보 ) : 3
	 // 당신은 보를 냈습니다.
	 // 컴퓨터는 바위를 냈습니다.
	 // 플레이어가 승리하였습니다! 
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			
			System.out.print("숫자를 선택하세요(1.가위 /2.바위 / 3.보 ) : ");
			int com = rand.nextInt(3) + 1;
			int user = sc.nextInt();
			
			if (!(user > 0 && user <4)) {
				System.out.println("1~3 사이의 숫자를 입력해주세요.");
				continue;
			}
			// 1~3 사이의 숫자 , 0~2 + 1 -> 1~3
			
			
			// 결과
			System.out.println("===== 결과 =====");
			
			// 플레이어는 무엇을 냈는가
			switch(user) {
			  case 1:
				System.out.println("당신은 가위를 냈습니다.");
				break;
			  case 2:
				System.out.println("당신은 바위를 냈습니다.");
				break;
			  case 3:
				System.out.println("당신은 보를 냈습니다.");
				break;
		    	}
	
			// 컴퓨터는 무엇을 냈는가 출력
			switch(com) {
			  case 1:
				System.out.println("컴퓨터는 가위를 냈습니다.");
				break;
			  case 2:
				System.out.println("컴퓨터는 바위를 냈습니다.");
				break;
			  case 3:
				System.out.println("컴퓨터는 보를 냈습니다.");
				break;
		    	}		
			System.out.println("================");
			
			// 게임 결과 
			// 플레이어가 승리한 경우
			// 가위 / 바위 / 보 <=> 보 / 가위 / 바위
			if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2 ) {
				System.out.println("플레이어가 승리하였습니다.");
				
			} else if (user == com ) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("컴퓨터가 승리하였습니다.");
			}
			
			// 플레이어가 승리하였습니다.
			// or 비겼습니다.
			// or 컴퓨터가 승리하였습니다.
		}
	}
		 
 }
	
