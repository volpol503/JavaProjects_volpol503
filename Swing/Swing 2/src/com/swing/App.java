package com.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new MainFrame();
			}
			
		});
		
//		JFrame frame = new JFrame("Swing 1");
		
		
		

	}
}
