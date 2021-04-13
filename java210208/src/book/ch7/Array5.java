package book.ch7;

public class Array5 {
	void methodB(boolean isOk[]) {
		System.out.println(isOk[3]);
	}
	/*
	 * 10-11(선언만-초기화가 안됨-방크기가 결정되지 않았다.)
	*/
	public static void main(String[] args) {
		boolean isOk[] = null;//선언만 하였다. 크기가 결정되지 않았다.
		Array5 a5 = new Array5();
		a5.methodB(isOk);
	}

}
/*
 변수는 한번에 하나값만 담을 수 있다. - 장애
 배열은 한번에 여러개 값을 담을 수 있다.
 그러나 다른 타입은 담을 수가 없다. - 객체 배열
 또 끼워넣기가 불가하다. - 크기를 조절할 수 없다. - ArrayList사용하면 문제가 해결됨
 
 
 자료구조(List계열, Map계열, Set계열) - 늘었다 줄었다, 끼워넣기 가능, 회원탈퇴, 신입사원 등록
 
 
 
 */