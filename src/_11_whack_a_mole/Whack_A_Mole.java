package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_A_Mole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date date = new Date();

	void jbutton() {
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		Random ran = new Random();
		int randnum = ran.nextInt(24);

		frame.add(panel);

		for (int i = 0; i < 24; i++) {

			JButton button = new JButton();
			panel.add(button);
			;
			if (randnum == i) {
				button.setText("Mole!");
			}
			frame.setVisible(true);
			button.addActionListener(this);
			frame.setPreferredSize(new Dimension(400, 500));
			frame.pack();
		}

	}
	int whacked = 0;
	int moleswhacked = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	whacked++;	
		JButton pressed = (JButton) e.getSource();
		if (pressed.getText().equalsIgnoreCase("Mole!")) {
			jbutton();

			moleswhacked++;
			

		} else {
			speak("you missed child");
		}
		if (whacked == 10) {
			endGame(date,moleswhacked);
			
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
