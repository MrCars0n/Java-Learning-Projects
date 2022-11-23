// Mr. Ensminger
// Week of April 27th - May 3rd
// Chapter 3 - Lesson 1

// The "swing" library is included with Java. It provides a few simple GUI (Graphical User Interface) objects 
// for you to use, like message boxes, labels, buttons, checkboxes, images, etc...

// <your reaction> "OMG, SO IT'S LIKE VISUAL BASIC?!"

// <my response> Yes, it's like Visual BASIC.

// "swing" is mostly outdated and has been replaced by JavaFX, which we'll do a few things with later
// For us in class though, eh, swing is pretty cool to get started with!

// ----------------------------------------------------------

// Notice the x at the end of java here - it's an "extended" library
// Your imports (other than the old "swing" library) will NOT have the x, but it's easy to forget here for swing!
import javax.swing.*;

public class Ch3Lesson1
{
  public static void main(String args[])
  {
    // Making message boxes is pretty simple - be careful though, the message box MAY pop up behind your code
    //  window. If you run this and "nothing happens", try minimizing Dr. Java
    JOptionPane.showMessageDialog(null, "Hello there!");
    
    // Let's talk about the line above, because you're going to be seeing lines like that A LOT in Java
    // Class names are always capitalized, so the "identifier" on the left of the "dot" is always the class name
    // JOptionPane is the name of a class in swing - Windows is trademarked, so Java calls things "panes" and "frames"
    // Get it? Hilarious.
    
    // The "identifier" to the right of the "dot" is a function of the class. These are always lower case/camel style
    // showMessageDialog is the name of a function (in Java, we'll call them methods for reasons I won't get into now)
    
    // As I said, this happens A LOT in Java, for example, Math.sqrt(16) is how you'd call the square root of 16
    // The class is called Math, the method is called sqrt
    
    // The "null" in the line above is necessary, but it really just puts the message box in the center of the screen
    
    // Let's look at some other options - this is how you'd add a title and an icon (you can look up the other styles)   
    JOptionPane.showMessageDialog(null, "This is nice", "A title!", JOptionPane.ERROR_MESSAGE);
    
    // -----------------------------------------------------------
    
    // How about getting input from a dialog box? Okay! Use inputDialog rather than messageDialog!
    
    String name = JOptionPane.showInputDialog("Please enter your name: ");
    System.out.println("What's up, " + name);
    
    // What about entering integers? Well, just like VB, they're entered as text, so we need to convert them.
    // Here's how!
    
    String sNum1 = JOptionPane.showInputDialog("Please enter the first number: ");
    int num1 = Integer.parseInt(sNum1);
    
    String sNum2 = JOptionPane.showInputDialog("Please enter the second number - and be sure to use a decimal!");
    double num2 = Double.parseDouble(sNum2);
    
    double total = num1 + num2;
    System.out.println(total);
    
    // Again, notice the class name dot function name style that Java uses?
    // Integer.parseInt and Double.parseDouble will convert a string into an integer or double, respectively
    
  }
}