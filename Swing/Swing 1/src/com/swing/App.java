package com.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {

			}
			
		});
		
		JFrame frame = new JFrame("Swing 1");
		
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setVisible(true);

	}
}
