package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
 
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame(){
	 super("Swing2");
	 
	 setLayout(new BorderLayout());



	 textArea = new JTextArea();
	 btn = new JButton("Click Me");

	 btn.addActionListener(new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent actionEvent) {
		 	textArea.append("App\n");
		 }
	 });

	 add(textArea, BorderLayout.CENTER);
	 add(btn, BorderLayout.SOUTH);

	 setSize(600, 500);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setVisible(true);
 }
}
