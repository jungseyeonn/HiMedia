package login;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main extends WindowAdapter implements ActionListener {
	private Frame f, fMain;
	private TextField tfid, tfPwd, tfMsg;
	private Button bLogin;
	private MemberDAO dao;

	public Main() {
		dao = new MemberDAO();

		f = new Frame("Login");
		f.setSize(500, 300);
		f.setLocation(700, 400);// 시작 위치 지정
		f.setLayout(null);
		f.addWindowListener(this);

		Label lid = new Label("ID : ");
		lid.setBounds(60, 60, 100, 40);

		tfid = new TextField();
		tfid.setBounds(160, 60, 190, 40);

		Label lpwd = new Label("Passward : ");
		lpwd.setBounds(50, 130, 100, 40);

		tfPwd = new TextField();
		tfPwd.setBounds(160, 130, 190, 40);
		tfPwd.setEchoChar('*');

		bLogin = new Button("Login");
		bLogin.setBounds(380, 90, 50, 50);
		bLogin.addActionListener(this);

		tfMsg = new TextField();
		tfMsg.setBounds(50, 200, 380, 50);
		tfMsg.setEditable(false);
		tfMsg.setFocusable(false);

		f.add(lid);
		f.add(tfid);
		f.add(lpwd);
		f.add(tfPwd);
		f.add(bLogin);
		f.add(tfMsg);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	public void windowClosing(WindowEvent e) {
		System.out.println(e.getComponent().getName());
		
		if(e.getComponent().getName().equals("frame0")) {
			fMain.dispose();
		} else {
			f.dispose();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Click");
		System.out.println(tfid.getText() + " : " + tfPwd.getText());

		String strId = tfid.getText();
		ArrayList<MemberVo> list = dao.list(strId);

		System.out.println("list.size() : " + list.size());
		if(list.size()==1) {
			MemberVo data = (MemberVo) list.get(0);
			String id = data.getId();
			String pwd = data.getPassword();

			System.out.println("DB==>" + id + " : " + pwd);

			if (tfPwd.getText().equals(pwd) && tfid.getText().equals(id)) {
				System.out.println("로그인이 되었습니다.");
				tfMsg.setText("로그인이 되었습니다.");
				
				fMain = new Frame("메인프레임");
				fMain.setBounds(800,300,300,300);
				fMain.addWindowListener(this);
				fMain.setVisible(true);
			} else {
				System.out.println("다시 입력하세요.");
				tfMsg.setText("다시 입력하세요.");
			}
		} else {
			tfMsg.setText("ID를 다시 입력하세요.");
		}
	}
}