package favoritePet;

import javax.swing.JFrame;

public class Frame extends JFrame{
	Frame(){ // JFrame: GUI window you can add components to	
		// Setting the frame for the window
	    setTitle("Button"); 	// sets title of frame
	    setSize(500, 500); 		// sets x and y dimension of frame
	    setResizable(false); 	// prevents frame from being resized
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits program/application
	    setVisible(true); 		// makes frame visible
	}
}
