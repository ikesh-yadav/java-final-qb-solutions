package q4_a;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Q4_a_applet extends Applet implements KeyListener {
	TextField t1=new TextField();
	public void init() {
		this.setLayout(null);
		t1.addKeyListener(this);
		t1.setBounds(0,20,100,20);
		this.add(t1);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("Q 4 A ", 0, 10);
		
	}
	public void keyTyped(KeyEvent k) {
		if(k.getKeyChar()=='p') {
			//showStatus(Character.toString(k.getKeyChar()));
			String palin=(t1.getText());
			String rev=new StringBuilder(palin).reverse().toString();
			if(palin.equals(rev)) showStatus(palin+" is a Palindrome");
			else	showStatus(palin+" is Not a plaindrome");
		}
	}
	public void keyPressed(KeyEvent k) {}
	public void keyReleased(KeyEvent e) {}

}
