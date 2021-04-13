package variable.step1;

public class StaticTest {
	/*
	 * non-static타입은 static영역에서 접근 불가, 호출안돼, 사용 못해
	 */
	static void avg( ) {//사용자 정의 메소드 입니다.
		System.out.println("avg호출 성공");
	}
	public static void main(String[] args) {
//		if(args==null | args.length>0) {
		if(args.length==0) {
			//아래 문장은 조건에 따라 한 번도 실행기회를 못 가질 수도 있다.
			System.out.println("야 입력해야지");
			return;//main메소드 탈출하기
		}
		System.out.println(args[0]+10);//20출력되도록 코드를 수정하시오. 1010말고 20출력되는 걸 보고 싶다면 어떡하지?
		int imsi = Integer.parseInt(args[0]);
		System.out.println(imsi+10);//20출력되도록 코드를 수정하시오. 1010말고 20출력되는 걸 보고 싶다면 어떡하지?
		System.out.println("==========>"+imsi+10);//20출력되도록 코드를 수정하시오. 1010말고 20출력되는 걸 보고 싶다면 어떡하지?
		//주소번지 없이도 호출할 수 있는 메소드가 있다. 메소드 이름 앞에 static이 있다면....
		//main메소드는 자바가 제공하는 메소드 입니다.O|X
		//사용자 정의 메소드도 가능하다.
		//내가 필요한 메소드는 문자열을 집어 넣으면(파라미터로) int타입으로 변한하여서 변환(리턴, 돌려주는, 대입연산자로 받을 수)해주는 메소드가 필요해요.
		//parseInt()입니다.
		//네이버나 구글링을 해서 위 요구사항을 만족하는 코드를 작성해 보시요.
		StaticTest.avg();
	}

}
