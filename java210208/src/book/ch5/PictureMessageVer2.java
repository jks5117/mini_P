package book.ch5;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class PictureMessageVer2 extends JDialog {
	//선언부
	String imgPath = "C:/Users/chokiseol/eclipse-workspace/java210208/src/";
	JPanel jp_emoticon = new JPanel();
	GridLayout gl_emoticon = new GridLayout(1,5,2,2);
	JButton pic0 = new JButton();
	JButton pic1 = new JButton();
	JButton pic2 = new JButton();
	JButton pic3 = new JButton();
	JButton pic4 = new JButton();
	String imgFile[] = {"lion11.png", "lion22.png", "lion33.png", "lion44.png", "lion55.png"};
	JButton imgButton[] = {pic0,pic1,pic2,pic3,pic4};
	ImageIcon img[] = new ImageIcon[imgButton.length];
	//생성자
	public PictureMessageVer2() {
		
	}
	//화면처리부
	public void initDisplay() {
		jp_emoticon.setLayout(gl_emoticon);
		for(int i=0;i<img.length;i++) {
			img[i] = new ImageIcon(imgPath+imgFile[i]);
			
		}
		pic0.setIcon(img[0]);
		pic0.setBorderPainted(false);
		pic0.setFocusPainted(false);
		pic0.setContentAreaFilled(false);
		pic1.setIcon(img[1]);
		pic2.setIcon(img[2]);
		pic3.setIcon(img[3]);
		pic4.setIcon(img[4]);
		//pic0.setIcon(new ImageIcon(imgPath+imgFile[0]));
		//pic1.setIcon(new ImageIcon(imgPath+imgFile[1]));
		//pic2.setIcon(new ImageIcon(imgPath+imgFile[2]));
		//pic3.setIcon(new ImageIcon(imgPath+imgFile[3]));
		//pic4.setIcon(new ImageIcon(imgPath+imgFile[4]));
		jp_emoticon.add(pic0);
		jp_emoticon.add(pic1);
		jp_emoticon.add(pic2);
		jp_emoticon.add(pic3);
		jp_emoticon.add(pic4);
		//this.add("Center", pic0);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add("Center", jp_emoticon);
		this.setSize(500, 200);
		this.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		PictureMessageVer2 pm = new PictureMessageVer2();
		pm.initDisplay();
	}

}
