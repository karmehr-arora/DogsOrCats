package favoritePet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

/**
 * @author Karmehr Arora
 */
class DogsOrCats {
	public static void main(String[] args) {
		// Jlabel = a GUI display area for a string of text, an image, or both
	    // Setting the Color, Font, Text Type, Size, and alignment in the panel
	    JLabel label = new JLabel("Best Pet: Dogs or Cats?");
	    label.setForeground(Color.BLACK);
	    label.setFont(new Font("SansSerif", Font.BOLD, 40));
	    label.setVerticalAlignment(JLabel.CENTER);
	    label.setHorizontalAlignment(JLabel.CENTER);
	    
	    // dog & cat buttons
	    JButton dog = new JButton("Dogs");
	    dog.setBounds(150, 100, 75, 37);

	    JButton cat = new JButton("Cats");
	    cat.setBounds(50, 100, 75, 37);
	    
	    // JPanel: a GUI component that functions as a container to hold other components
		JPanel panel = new JPanel();
	    panel.setBounds(0, 0, 500, 200);
	    panel.setLayout(new BorderLayout());
	    panel.add(label);
	
		JPanel buttonPanel1 = new JPanel();
	    buttonPanel1.setBounds(0, 200, 250, 300);
	    buttonPanel1.setLayout(null);
	    buttonPanel1.add(dog);
	    
	    JPanel buttonPanel2 = new JPanel();
	    buttonPanel2.setBounds(250, 200, 250, 300);
	    buttonPanel2.setLayout(null);
	    buttonPanel2.add(cat);
	    
	    Frame frame = new Frame();
	    frame.setLayout(null);
	    frame.add(panel);
	    frame.add(buttonPanel1);
	    frame.add(buttonPanel2);
	}
}