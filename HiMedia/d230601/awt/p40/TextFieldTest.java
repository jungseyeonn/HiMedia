package awt.p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
	private Frame f,f2;
	private Button b;
	private TextField id, pwd, msg;
	private final String STRING_ID = "seyeon";
	private final String STRING_PWD = "1234";
	
	public TextFieldTest() {
		f2 = new Frame("Main");
		f2.setSize(400,400);
		
		f = new Frame("Login");
		f.setSize(400, 120);
		f.setLayout(new FlowLayout());

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		b = new Button("login");
		msg = new TextField(40);
		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(msg);
		f.setVisible(true);
		
		b.addActionListener(this);
		
		msg.setEditable(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(id.getText().equals(STRING_ID) && pwd.getText().equals(STRING_PWD)) {
			msg.setText("로그인성공");
			f2.setVisible(true);
		} else {
			msg.setText("로그인실패");
		}
	}
	
	public static void main(String[] args) {
		TextFieldTest t = new TextFieldTest();
	}
}
