package level2.basic;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SungJukTop extends JPanel {
	JTextField 	jtf_inwon 	= new JTextField(5);
	JLabel 		jlb_inwon 	= new JLabel(" 명");
	JButton 	jbtn_create = new JButton("만들기");
	public void initDisplay() {
		this.setBackground(Color.orange);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jtf_inwon);
		this.add(jlb_inwon);
		this.add(jbtn_create);
	}
}