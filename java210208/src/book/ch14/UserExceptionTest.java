package book.ch14;
/*
 * API를 보는 습관을 들이자.
 * 1일 1커밋하는 의식을 들이자.
 * 
 * 
 * 
 */

public class UserExceptionTest {
	public void test(String[] a) throws UserException{
		System.out.println("test 호출 성공");
		if(a.length<1) 
			throw new UserException("형 아무것도 없어요.");
		else 
			throw new UserException("최종 예선.", 7000);
	}
	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();
		try {
			uet.test(args);
		} catch (UserException ue) {
			//System.out.println(ue.printStackTrace(););
			//ue.printStackTrace();
			System.out.println("[[[[[[[[[[[[[[[[[[UserException]]]]]]]]]]]]]]]]]]]"+ue.toString());
			System.exit(0);//자바 가상머신과의 연결고리를 끊음.
		} catch (Exception e) {
			e.toString();
			e.getMessage();
			e.printStackTrace();
		} finally {
			System.out.println("finally-무조건 실행됨.");
		}
		
	}
}
