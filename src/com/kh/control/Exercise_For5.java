package com.kh.control;

public class Exercise_For5 {
	// 0시 0분 부터 23시 59분까지 출력하기 
	public static void main(String []args) {
		
		for (int i=0; i<24; i++) {
			for (int j=0; j<60; j++) {
//				System.out.println(i+"시 "+j+"분");
				System.out.printf("%2d시 %2d분\n", i, j);
				// \n 은 출력이 되는 부분을 개행해줌 
			}
		}
	}
}
