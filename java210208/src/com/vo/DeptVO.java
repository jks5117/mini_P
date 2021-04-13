package com.vo;
//오라클과 자바 만남
//이어야 됨 - 연결고리
//VO패턴 - 데이터의 영속성을 유지해주는 오라클 서버 제품과 연결하기
//Data관리 목적 - 모든 집합의 이름 뒤에 접미어로  VO붙임.
//메인메소드는 필요없다. 단독으로 실행하지 않는다.
/*
 * Number(2) - 정수형 . 담을 수 있는 최대 크기는 99까지 임계값 
 *           - int(4byte), long(8byte)
 *           
 * varchar2(4000) -  String
 * VO패턴을 사용하면 한꺼번에 3가지 종류[부서번호, 부서명, 지역]의 값을 관리 가능함.
 * 서버 자체는 항상 동시에 여러사람이 접속할 수 있다.
 * 이 여러사람을 따로 관리할 수 있어야 하겠다. - Thread공부 - 너가 직접 서버를 운영할 수 있는 코딩 보여줌.
 * 인스턴스화 하는 이유
 * DeptVO dvo = new DeptVO();
 * 
 * dvo = new DeptVO();
 * 
 * dvo = new DeptVO();
 * 이것은 합법인가?
 * 어떻게 다른걸까?
 * 어떤 방법이 더 좋은걸까?
 * 언제 저렇게 써야 하나?
 * 
 */
public class DeptVO {
	private int 	deptno = 0;//원시형 타입 - 부르면 값이 나온다.  4byte이니까 229540 229544 229548 ....
	private String 	dname  = null;//레퍼런스 타입 - 클래스 급이다.- 값이 아니라 주소번지가 나온다. 영업부 출력되지 않나요? 네 예외죠. 돌연변이 그러니까 중요함.
	private String  loc	   = null;
	//insert here
	private EmpVO   eVO    = null;
	//getter메소드 - Read- 리턴타입이 있다.
	public int getDeptno() {//파라미터는 필요없다.
		return deptno;//0
	}
	//setter메소드 - Write, Save 느낌으로 접근해보기
	//리턴타입은 필요없다. 그러나 파라미터는 반드시 필요함.
	public void setDeptno(int deptno) {
		//deptno = 30;//상수, 재사용성이 떨어짐.
		//this는 나 자신을 가리키는 수정자 이다.여기서는 지변과 식별을 위해 사용하였다. 생략할 수 있다. 그런데 헷갈린다.
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {//지변
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}