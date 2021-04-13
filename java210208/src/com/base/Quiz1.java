package com.base;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
			System.out.println(rd.nextInt(10));
		
		int n;
		
		System.out.println("컴퓨터가 정한 숫자를 맞춰 보시오.");
		n = sc.nextInt();		
		
		
		if(n==rd.nextInt()) {
			System.out.println("정답입니다.");
	
		//}else (n<rd.nextInt()) {
			//System.out.println("오답입니다.");
		}
		
	}		
		
}

