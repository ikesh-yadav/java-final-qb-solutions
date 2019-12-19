package q14_a;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Q14_a extends Applet implements MouseMotionListener,MouseListener {
	int rectX=0,rectY=0,downX=0,downY=0;
	public void init() {
		setLayout(null);
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(400,400);
	}
	public void drawRectangle() {
		Graphics g=getGraphics();
		g.drawRect(downX, downY, rectX-downX, rectY-downY);
	}
	public void paint(Graphics g){
		g.drawString("Hello", 10, 10);
		//g.drawRect(downX, downY, rectX-downX, rectY-downY);
		drawRectangle();
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		showStatus("X:"+arg0.getX()+",Y:"+arg0.getY());
		rectX=arg0.getX();
		rectY=arg0.getY();
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		downX=e.getX();
		downY=e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//if you want the rectangle to stay on screen when mouse is released remove next 4 lines
		rectX=0;
		rectY=0;
		downX=0;
		downY=0;
		repaint();
	}
}
