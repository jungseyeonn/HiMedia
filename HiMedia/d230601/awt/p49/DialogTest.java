package awt.p49;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter implements ActionListener {
	private Frame f;
	private Dialog info;
	private Label msg;
	private Button ok;

	public DialogTest() {
		f = new Frame("Parent");
		info = new Dialog(f, "Information", true);
		msg = new Label("This is modal Dialog", Label.CENTER);
		ok = new Button("OK");
	}
	
	public void startFrame() {
		f.setSize(300, 200);
		info.setSize(150, 100);
		info.setLocation(75, 50);
		info.setLayout(new FlowLayout());
		info.addWindowListener(this);
		info.add(msg);
		info.add(ok);

		f.addWindowListener(this);
		ok.addActionListener(this);
		info.addWindowListener(this);
		
		f.setVisible(true);
		info.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		info.dispose();
		if (e.getComponent() == info) {
			info.dispose();
		} else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		DialogTest d = new DialogTest();
		d.startFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		info.dispose();
	}
}
