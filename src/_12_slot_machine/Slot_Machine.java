//You forgot to sign out.
package _12_slot_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton spin = new JButton();

int randnum;
int randnum2;
int randnum3;

JLabel slot1 = new JLabel();
JLabel slot2 = new JLabel();
JLabel slot3 = new JLabel();

void somthing() {

try {
	slot1 = createLabelImage("cherry.png");
	slot2 = createLabelImage("orange.png");
	slot3 = createLabelImage("Bananas.png");
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

spin.addActionListener(this);
panel.add(slot1);
panel.add(slot2);
panel.add(slot3);
panel.add(spin);
frame.add(panel);
frame.setVisible(true);
frame.pack();
	





}






private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}


void random() { panel.remove(slot1);
panel.remove(slot2);
panel.remove(slot3);
	Random ran1 = new Random();

 randnum = ran1.nextInt(3);
if (randnum == 1) { try {
	slot1 = createLabelImage("cherry.png");
} catch (MalformedURLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}else if (randnum == 2) { try {
	slot1 = createLabelImage("orange.png");
} catch (MalformedURLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}else {
	try {
		slot1 = createLabelImage("Bananas.png");
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

Random ran2 = new Random();
 randnum2 = ran1.nextInt(3);
if (randnum2 == 1) { try {
	slot2 = createLabelImage("cherry.png");
} catch (MalformedURLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}else if (randnum2 == 2) { try {
	slot2 = createLabelImage("orange.png");
} catch (MalformedURLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}else {
	try {
		slot2 = createLabelImage("Bananas.png");
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
}
	Random ran3 = new Random();
	 randnum3 = ran1.nextInt(3);
	if (randnum3 == 1) { try {
		slot3 = createLabelImage("cherry.png");
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}else if (randnum3 == 2) { try {
		slot3 = createLabelImage("orange.png");
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}else {
		try {
			slot3 = createLabelImage("Bananas.png");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}


panel.add(slot1);
panel.add(slot2);
panel.add(slot3);



}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	random();
	frame.pack();
	if (randnum == randnum2 && randnum2 == randnum3) {
		playSound("money.wav");
		JOptionPane.showMessageDialog(null,"You WIN nothing");
	
	}
	



}
private void playSound(String filename) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(filename));
    sound.play();
}


}

