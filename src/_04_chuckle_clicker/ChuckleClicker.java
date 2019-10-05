package _04_chuckle_clicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {

		ChuckleClicker clicker = new ChuckleClicker();

		clicker.makebuttons();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();

	JButton makebuttons() {

		joke.addActionListener(this);
		punchline.addActionListener(this);

		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.setText("Joke");
		punchline.setText("Punchline");
		frame.setVisible(true);
		frame.pack();
		return null;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "HI");
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null,
					"What's the best thing about Switzerland?");

		}
		if (e.getSource() == punchline) { JOptionPane.showMessageDialog(null,"I don't know, but the flag is a big plus!");
			
		}
	}

}
