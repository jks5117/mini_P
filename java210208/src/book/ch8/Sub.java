package book.ch8;

public class Sub extends Super {
	public Sub() {
		System.out.println("sub()자식 호출 성공");
	}
	public Sub(String title) {
		System.out.println("sub(String) 호출 성공");
		this.title = title;
	}
	@Override
	public void methodA() {
		System.out.println("Sub methodA 호출 성공");
	}
	public void methodA(int x) {
		System.out.println("Sub methodA(int) 호출 성공");
	}
	public void methodB() {
		System.out.println("Sub methodB 호출 성공");
	}
}