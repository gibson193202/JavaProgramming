package chapter9;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Menu;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class Run {
	
	public static void main(String[] args) throws Exception {

			StringBuffer sb=RWfile.readFile(args[0]);
			CRUDoperation.delete("и", sb);
			//CRUDoperation.update("a", "aa", sb);
			//LetterOperation.vowelLAtter(sb);
			
			System.out.println(sb);
			
			
			
			//FileWriter wf=new FileWriter(new File(args[1]));
			
			
			
		
		
		
	}

}
