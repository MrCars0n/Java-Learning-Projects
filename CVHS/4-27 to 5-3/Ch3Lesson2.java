// Mr. Ensminger
// Week of April 27th - May 3rd
// Chapter 3 - Lesson 2

// Let's have some more fun with swing!

import java.awt.*;      // The "advanced windows toolkit" -- oooooo!
import javax.swing.*;
 
public class Ch3Lesson2 implements Runnable 
{
    public void run() 
    {
        // Creates the window. Do you like the name I chose?
        JFrame form1 = new JFrame("Form1");
        
        // Add a layout manager so that the button is not placed on top of the label
        // FlowLayout essentially means "add things in order from left-to-right, top-to-bottom"
        form1.setLayout(new FlowLayout());
        
        // Add a label (!!!!) and a button (!!!!)
        form1.add(new JLabel("Hello, world!"));
        form1.add(new JButton("Press me!"));
        
        // (FYI - the button isn't programmed to do anything, sorry! A bit more complicated.)
        
        // Arrange the components inside the window. We did this in Python with TKinter, too, if you recall.
        // In the beforetimes, the long, long ago -- September of 2018.
        form1.pack();
        
        // Set the form's width and height
        form1.setSize(500,200);
        
        // By default, the window is not visible. Silly, right? Make it visible!
        form1.setVisible(true);
    }
 
    public static void main(String[] args) 
    {
      // Wait, huh? The main function isn't until down here? And what is up with this line?!
        Ch3Lesson2 myApp = new Ch3Lesson2();
        
        // Wait, huh? 
        SwingUtilities.invokeLater(myApp);
    }
}

// FYI - the program above? Yeah, it's a more complicated example, and I assure you that you don't need to know the 
//  content for any upcoming programs, graded or otherwise. I just thought you'd like to see some of the stuff swing
//  is capable of! 
