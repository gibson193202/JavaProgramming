package chapter14.A1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class A1 extends JFrame{
	Container c;
	JLabel label, label2;
	int i=0;
	
	public A1() {
		
		c=getContentPane();
		c.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		label=new JLabel("label1");
		label.setBounds(0, 0, 50, 50);
		c.add(label);

		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				new Thread() {
					Random rand=new Random();
					
					public void run() {
						
						while(true) {
							for(int i=0; i<c.getWidth()-label.getWidth(); i=i+1) {
								label.setBounds(i, 0, 50, 50);
								//label.setForeground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							for(int i=c.getWidth()-label.getWidth(); i>0; i=i-1) {
								label.setBounds(i, 0, 50, 50);
								
								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						
						
					}
				}.start();
				
				new Thread() {
					Random rand=new Random();
					@Override
					public void run() {
						while(true) {
							label.setForeground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}.start();

				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.setBounds(200, 200, 200, 200);
		a1.setVisible(true);
		
		
	}
}
