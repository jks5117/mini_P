package com.base;

import java.util.Scanner;

public class Quest1 {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.println("당신의 몸무게를 입력하세요.");
		n = sc.nextInt();
	
		System.out.println("달에서의 당신의 몸무게는 " + n*17/100 +"kg"+ "입니다.");
				
		
	}

}
