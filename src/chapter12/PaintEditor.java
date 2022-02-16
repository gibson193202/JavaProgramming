package chapter12;

import java.awt.event.*;
import java.util.Arrays;
import java.util.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.*;



public class PaintEditor extends JFrame{
	private int prevX, prevY;
	private Color color=Color.BLACK;
	private JButton jButton=new JButton("ColorChooser");
	
	
	public PaintEditor() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jButton);
		
		jButton.addActionListener(new ButtonActionListener());
		addMouseListener(new PaintMouseAdapter());
		addMouseMotionListener(new PaintMouseMonitorAdapter());
	}
	
	public void setPreviousCoordinates(int aPrevX, int aPrevY) {
		prevX=aPrevX;
		prevY=aPrevY;
	}
	
	private class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			color=JColorChooser.showDialog(((Component)e.getSource()).getParent(), "Demo", color);
		}
	}

	private class PaintMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			setPreviousCoordinates(e.getX(), e.getY());
		}
	}

	private class PaintMouseMonitorAdapter extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g=getGraphics();
			g.setColor(color);
			g.drawLine(prevX, prevY, e.getX(), e.getY());
			setPreviousCoordinates(e.getX(), e.getY());
		}
	}

	public static void main(String[] args) {
		PaintEditor pe=new PaintEditor();
		pe.setBounds(200,100,300,200);
		pe.setTitle("Paint");
		pe.setVisible(true);
		
		Set<Integer> s=new TreeSet<Integer>();
		Integer[] sa=new Integer[] {1,2,3,4,3,2};
		Collections.addAll(s, sa);
		Iterator<Integer> i=s.iterator();
		
		for(Integer a:s) {
			System.out.println(a);
		}
		
		
		pe.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
