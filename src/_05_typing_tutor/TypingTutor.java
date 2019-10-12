
package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	int streak = 0;
	public static void main(String[] args) {

		TypingTutor test = new TypingTutor();

		test.extra();

	}

	char currentLetter;

	private void extra() {
		frame.addKeyListener(this);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		panel.add(label);
		frame.add(panel);
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		

	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			panel.setBackground(new Color(0,255,0));
			streak++;
		} else {panel.setBackground(Color.red); streak = 0;
			System.out.println(" Wrong you typed " + e.getKeyChar());
		}
	
	if (streak == 10) {
		System.out.println("10 STREAK!");
		
	}
	
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	
	}

}
