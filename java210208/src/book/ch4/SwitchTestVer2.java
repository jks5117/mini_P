package book.ch4;

import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwitchTestVer2 extends JFrame {

	public static void main(String[] args) {
		SwitchTestVer2 stv = new SwitchTestVer2();
		int     protocol   = 0;
		String  nickName   = "tomato";
		String  inputValue = "오늘 스터디 할까?";
		String  msg        = 300+"#"+nickName+"#"+inputValue;  
		StringTokenizer st = new StringTokenizer(msg,"#");
		protocol = Integer.parseInt(st.nextToken());
		String s_nickName = st.nextToken();
		String s_inputValue = st.nextToken();
		switch(protocol) {
		case 100:
			System.out.println("0입니다.");		
			break;
		case 200:
			System.out.println("10입니다.");
			break;
		case 300:
			System.out.println("["+nickName+"]"+s_inputValue);
			break;
		default:
			JOptionPane.showMessageDialog(stv, "잘못된 메시지 입니다.");
			break;
		}
		System.out.println("여기");
	}

}
