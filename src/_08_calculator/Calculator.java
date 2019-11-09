package _08_calculator;

import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JLabel label = new JLabel();
	
	void gui() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		text1.setPreferredSize(new Dimension(300,50));
		text2.setPreferredSize(new Dimension(300,50));
		button1.setText("Add");
		button2.setText("Subtract");
		button3.setText("Multiply");
		button4.setText("Divide");
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
	
	
	
	void add() {


String add1 = text1.getText(); 
String add2  = text2.getText();	
	int add = Integer.parseInt(add1);
	int add22 = Integer.parseInt(add2);
	
	label.setText(add+add22+"");

	
	
	}

	void subtract() {
	String sub = text1.getText();	 
	String sub22 = text2.getText();
	int sub1 = Integer.parseInt(sub);
	int sub2 = Integer.parseInt(sub22);
	label.setText(sub1-sub2+"");
	}

	void multiply() {
		String mul = text1.getText();
		String mul1 = text2.getText();
		int mul2 = Integer.parseInt(mul);
		int mul3 = Integer.parseInt(mul1);
		label.setText(mul2*mul3+"");
				
				
				
				
	}

	void divide() {
		String div = text1.getText();
		String div1 = text2.getText();
		int div2 = Integer.parseInt(div);
		int div3 = Integer.parseInt(div1);
		label.setText(div2/div3+"");
				

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
	if (button1 == e.getSource()) {
		add();
	}	
	if (button2 == e.getSource()) {
		subtract();
	}
	if (button3 == e.getSource()) {
		multiply();
	}
	if (button4 == e.getSource()) {
		divide();
	}
	
	
	
	frame.pack();
	}

}
