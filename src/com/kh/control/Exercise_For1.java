package com.kh.control;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
		// �Է¹��� ������ ���� ���
		// �Է¹��� ������ �ܺ��� 9�ܱ��� ���(��ø for��)
		// 9�� �ʰ��ϴ� ���ڰ� ������ "9 ������ ���ڸ� �Է����ּ���" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();

		if (dan <= 9) {
			for (int j = dan; j <= 9; j++) {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d \n", j, i, j * i);
				}
				System.out.println();
			}
		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}

	}

}
