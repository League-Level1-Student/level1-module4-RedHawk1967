package _08_calculator;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JLabel label = new JLabel();
	
	private void gui() {
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	
	int add() {

		return 0;

	}

	int subtract() {
		return 0;

	}

	int multiply() {
		return 0;

	}

	int divide() {

		return 0;

	}

}
