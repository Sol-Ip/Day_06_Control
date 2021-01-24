package com.kh.random;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random3 {
	// UP & DOWN 게임
	// 이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.
	// 0을 입력하면 게임을 종료합니다.
	// 숫자를 입력해주세요 (user) : 55
	// UP!
	// 숫자를 입력해주세요 (user) : 77
	// DOWN!
	// 숫자를 입력해주세요 (user) : 64
	// 유저가 정답을 2번만에 맞췄습니다!
	public static void main(String[]args) {
		Random rand = new Random();
		Scanner sc= new Scanner(System.in);
		

			System.out.println("=== UP & DOWN 게임 ===");
			System.out.println("이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.");
			System.out.println("0을 입력하면 게임을 종료합니다.");
			int goalNum = rand.nextInt(100)+1;
			int countNum = 0;
			
			while (true) {
				System.out.print("숫자를 입력해주세요 : ");
				int userNum = sc.nextInt();
				countNum++;	//입력 횟수 카운트
				
				// 맞추려는 숫자와 비교
				// 맞추려는 숫자가 크면 up
				if (goalNum > userNum) {
					System.out.println("UP!");
				  } else if (goalNum < userNum) {
						// 맞추려는 숫자가 크면 up
					System.out.println("DOWN!");
				  } else {
						// 정답 출력 
					System.out.println("유저가 정답을 "+ countNum + "번 만에 맞췄습니다!");
					System.out.println();
					System.out.println();
				}		
			}
		}	
	}

