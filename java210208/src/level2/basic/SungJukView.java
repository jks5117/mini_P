package level2.basic;

import javax.swing.JFrame;

public class SungJukView extends JFrame {
	//선언부
	SungJukTop 		sjTop 		= new SungJukTop();
	SungJukCenter 	sjCenter 	= new SungJukCenter();
	SungJukBottom 	sjBottom 	= new SungJukBottom();
	
	//생성자
	public SungJukView() {
		
	}
	//화면 처리부
	public void initDisplay() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		sjTop.initDisplay();
		sjCenter.initDisplay();
		sjBottom.initDisplay();
		this.add("North", sjTop);
		this.add("Center", sjCenter);
		this.add("South", sjBottom);
		this.setSize(400, 250);
		this.setVisible(true);
	}
	//main메소드
	public static void main(String[] args) {
		SungJukView sj = new SungJukView();
		sj.initDisplay();
	}

}