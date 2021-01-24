package com.kh.control;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
		// 입력받은 숫자의 단을 출력
		// 입력받은 숫자의 단부터 9단까지 출력(중첩 for문)
		// 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan <= 9) {
			for (int j = dan; j <= 9; j++) {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d \n", j, i, j * i);
				}
				System.out.println();
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

	}

}
