package chapter11;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Formatter;

import javax.swing.JApplet;

public class DateApple extends JApplet{
	private Formatter dateFmt=new Formatter();
	private Formatter timeFmt=new Formatter();
	
	public void init() {
		setSize(180,100);
		
		Calendar c=Calendar.getInstance();
		String era="";
		if(c.get(Calendar.ERA)==1) {
			era="н.э.";
		}
		dateFmt.format("%tA %td.%tm.%Y года "+era, c,c,c,c);
		timeFmt.format("%tT", c);
	}
	
	public void print(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("Апплет стартовал в "+timeFmt,10, getHeight()/2);
		g.setColor(new Color(0,87,127));
		g.drawString(dateFmt.toString(), 13, getHeight()-10);
	}
	
}
