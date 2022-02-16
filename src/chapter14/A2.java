package chapter14;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class A2 extends JFrame{
	private Container container;
	private JLabel jLabel;
	
	public A2() {
		container=getContentPane();
		container.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(200, 200, 200, 200);
		setVisible(true);
		
		jLabel=new JLabel("text");
		jLabel.setBounds(0, 0, 50, 50);
		container.add(jLabel);
		
		addWindowListener(new WindowListener() {
			
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
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				new Thread() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(true) {
							for(int i=0; i<container.getHeight()-jLabel.getHeight(); i=i+10) {
								jLabel.setBounds(i, i, 50, 50);
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								setText();
							}
							
							for(int i=container.getHeight()-jLabel.getHeight(); i>0; i=i-10) {
								jLabel.setBounds(i, i, 50, 50);
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}.start();
			}
		});
		
		setBounds(200, 200, 200, 200);
		setVisible(true);
	}
	
	public void setText() {
		StringBuffer sb=new StringBuffer();
		char[] chars=jLabel.getText().toCharArray();
		for(int i=0; i<chars.length; i++) {
			sb.append(letterCase(chars[i]));
		}
		jLabel.setText(sb.toString());
		
	}
	
	public Character letterCase(char ch) {
		
		switch (new Random().nextInt(2)) {
		case 0:
			return Character.toLowerCase(ch);

		default:
			return Character.toUpperCase(ch);
		}
	}
	
	
	
	public static void main(String[] args) {
		new A2();
	}
	
	
	
	
}
