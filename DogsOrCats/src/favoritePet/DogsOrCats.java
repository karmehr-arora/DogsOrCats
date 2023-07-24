package favoritePet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Karmehr Arora
 * Dogs or Cats
 */
public class DogsOrCats extends JFrame implements ActionListener{
	// JButton: a button that performs an action when clicked on
	public static JButton dogs, cats;
	// Jlabel = a GUI display area for a string of text, an image, or both
	public static JLabel Answer;
    // JPanel: a GUI component that functions as a container to hold other components
	public static JPanel panel;
	
	DogsOrCats(){ 
		//need to add little icons of dog and cat pictures to put under the buttons
	    // create dog/cat icons here
		dogs = new JButton("Dogs");
	    dogs.setBounds(125, 300, 75, 37);
	    dogs.addActionListener(this);
	    
	    cats = new JButton("Cats");
	    cats.setBounds(300, 300, 75, 37);
	    cats.addActionListener(this);
	    
	    // JFrame: GUI window you can add components to	
		// Setting the frame for the window
	    setTitle("Button"); 	// sets title of frame
	    setSize(500, 500); 		// sets x and y dimension of frame
	    setResizable(false); 	// prevents frame from being resized
	    setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits program/application
	    setVisible(true); 		// makes frame visible
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cats) { // what no button does if clicked
			int x = (int) (Math.random() * 425);
			int y = (int) (Math.random() * 225) + 200;
			cats.setLocation(x, y); // setting button location
		}
		else if(e.getSource() == dogs) { // what yes button does if clicked
		    cats.setVisible(false);
		    dogs.setVisible(false); 
		    Answer.setText("I KNEW IT! :3");
		    Answer.setVerticalAlignment(JLabel.BOTTOM);
		}
	}
	
	public static void main(String[] args) {
		Answer = new JLabel("Best Pet: Dogs or Cats?");
	    // setting the Color, Font, Text Type, Size, and alignment in the panel
	    Answer.setForeground(Color.BLACK);
	    Answer.setFont(new Font("SansSerif", Font.BOLD, 40));
	    Answer.setVerticalAlignment(JLabel.CENTER);
	    Answer.setHorizontalAlignment(JLabel.CENTER);
	    Answer.setVisible(true);
	    
	    panel = new JPanel();
	    panel.setBounds(0, 0, 500, 200);
	    panel.setLayout(new BorderLayout());
	    panel.add(Answer);
	    
		DogsOrCats doggo = new DogsOrCats();
		doggo.add(panel);
		doggo.add(dogs);
		doggo.add(cats);
	}
}
