package com.kh.control;

public class Exam_Continue1 {
	// Continue는 반복문 안에서 사용 가능하며,
	// continue를 만나게 되면 다음의 내용을
	// 실행하지 않고 바로 증감식 도는 다음 값으로 
	// 건너 뛰라는 의미
	// ex) 1~10 사이의 수 중에서 3의 배수를 제외하고 출력하시오 
	public static void main(String []args) {
		
		for (int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 1부터 100까지의 정수들의 합을 출력하는데 
		// 4의 배수는 제외하고 출력하시오
		int sum = 0;
		for (int  i = 1; i <= 100; i++) {
			if(i % 4 == 0)
			continue;
			sum += i;
		}
		System.out.println("합 : "+sum);
		
		System.out.println();
		System.out.println();
		
		// 2~9단까지 구구단을 출력 하는데
		// 짝수단은 제외 하고 출력 하시오.
		// ex)3단 옆에 5단이 출력 되도록 할 것
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 2 = 6
		// ...
		
		// 2 * 1 = 2  3 * 1 = 3  4 * 1 = 4  5 * 1 = 5 ....
		for(int i =1; i < 10 ; i++) {
			for(int j = 2; j < 10 ; j++) { 
			if ( j % 2 == 0)
				continue;
	     		System.out.printf("%d * %d = %d\t", j, i, (j*i)); 	     	
	     		}
			System.out.println();
	       }
	   	}
	}

