import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Surpirse implements ActionListener {






	
	
	
	
	
	
	
	
	
	
	 JFrame frame = new JFrame();
	 JButton button1 = new JButton("Trick!");
	 JButton button2 = new JButton("Treat!");
	 JPanel panel = new JPanel();
	public static void main(String[] args) {
		

	}
	public void setup() {

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
		button1.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		showPictureFromTheInternet("https://ksassets.timeincuk.net/wp/uploads/sites/55/2017/03/Stephen-King-IT-920x584.jpg");
	}

	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}








}