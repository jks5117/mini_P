package com.quiz0222;
/*
 * non-static
 * 
 * 
 * static
 * 
 * 
 */
public class Q36 {
	//static 블럭이다.
	static {
		System.out.println("static block");
	}
	void methodA() {
		System.out.println("methodA 호출");
		
	}
	static void methodB() {
		System.out.println("static methodB 호출");
		
	}
	//메인메소드도 static이다.
	//main thread라고 한다. 우선순위가 높다.
	//자바스크립트는 싱글스레드이다.
	public static void main(String[] args) {
		System.out.println("static main");

	}

}
