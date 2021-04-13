package book.ch4;

public class SwitchTest {

	public static void main(String[] args) {
		int protocol = 100;
		protocol = 200;
		protocol = 300;
		protocol = 301;
		String id = "tomato";
		String input = "오늘 스터디 할까?";
		String msg = protocol+"#"+id+"#"+input;  
		
		switch(protocol) {
		case 0:
			System.out.println("0입니다.");		
			break;
		case 10:
			System.out.println("10입니다.");
			break;
		case 100:
			System.out.println("100입니다.");
			break;
		default:
			System.out.println("default입니다.");
			break;
		}
		System.out.println("여기");
	}

}
