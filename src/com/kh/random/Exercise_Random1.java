package com.kh.random;

import java.util.Random;
import java.util.Scanner;

// 동전 앞 뒤 맞추기 게임
// 숫자를 입력 (1. 앞면 / 2. 뒷면) : 1
// 맞췄습니다.

// 숫자를 입력 (1. 앞면 / 2. 뒷면) : 2
// 땡! 틀렸습니다.
// 저장 되어있는 숫자는 랜덤으로 생성한 난수
// 사용자가 입력한 값과 비교 후 결과를 출력
// 1 또는 2 이외의 값이 입력이 됐을 경우 "다시 입력하세요"를 출력 (continue 이용)

public class Exercise_Random1 {
	public static void main(String []args) {
		// 난수 생성
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== 동전 앞/뒤 맞추기 게임 =====");
			int com = rand.nextInt(2)+1;
			
			// 사용자 입력
			
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
			int num = sc.nextInt();

			if (!(num > 0 && num < 3)) {
				System.out.println("다시 입력하세요");
				continue;
			}
			// 난수와 입력값 비교
			// 출력
			if (num == com) {
				System.out.println("맞췄습니다!");
			} else {
				System.out.println("땡! 틀렸습니다.");
			}
		}
	}
}
	
		
		
		// 출력
		


