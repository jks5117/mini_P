package book.ch4;

import javax.swing.JOptionPane;

public class HakJum {

	public static void main(String[] args) {
		String s_jumsu = JOptionPane.showInputDialog("점수를 입력하세요.");
		break;
		int i_jumsu = Integer.parseInt(s_jumsu);
		System.out.println("당신이 입력한 점수는 "+s_jumsu+" 입니다.");
		System.out.printf("당신이 입력한 점수는 %s %n 입니다.", s_jumsu);
		switch(i_jumsu/10) {
		case 9: case 10:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			
		}
	}

}
