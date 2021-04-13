package variable.step1;

public class Variable {
	//선언부

	//메소드 선언
	void methodA(int x) {
		
	}
	double methodB(int X) {//는 지변 밖에서는 사용불가
		System.out.println(x);//1
		return 3.14;
	}
	//메인메소드 - exe파일로 만들 수 있어요.
	/************************************************
	 * 문제해결능력 키움
	 * @return void이다. - 비어있다. - 돌려 받을 수 있는 값이 없다. - 이것때문에 에러가 발생할 수도 있다.
	 * @param args
	 *************************************************/
	public static void main(String[] args) {
		//System:너의컴퓨터 out속성:출력장치(하드웨어-모니터, 프린터....), print(int i),
		System.out.print(5);//줄바꿈 안됨, 메소드를 호출할 수 있니? 주소번지.methodA();
		//메소드 선언할 때는 좌중괄호 우중괄호 를 사용하고...
		//메소드 호출할때는 ;으로 마침
		//API, XXX.jar, 이 안(클래스안에 객체[결정되지 않았다.]안에)에 있는 것을 꺼내쓴다.
		//print메소드는 여러개이다. 같은 이름의 메소드를 여러개 만들 수 있다.
		//SELECT 이름 FROM 회원 집합
		// Where 아이디='test'
		//  AND 비번='123'
		//System.out.print();//줄바꿈 안됨- 반환값이 없으니까 에러인거야? 출력결과물
		Variable v = new Variable();
		System.out.print(v.methodB(1));//3.14
		System.out.print(v.methodA(1));
		System.out.print(1+"   "+1);//줄바꿈 안됨
		System.out.print(10+10);//줄바꿈 안됨
		System.out.print(10+"10");//줄바꿈 안됨
		System.out.print(10+""+10);//줄바꿈 안됨
		System.out.print("   ");//줄바꿈 안됨
		System.out.println();//줄바꿈 추가된 메소드
	}

}