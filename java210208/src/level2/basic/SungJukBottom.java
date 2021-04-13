package level2.basic;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SungJukBottom extends JPanel {
	JButton 	jbtn_account = new JButton("처리");
	JButton 	jbtn_exit    = new JButton("종료");
	public void initDisplay() {
		this.setBackground(Color.green);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jbtn_account);
		this.add(jbtn_exit);
	}
}