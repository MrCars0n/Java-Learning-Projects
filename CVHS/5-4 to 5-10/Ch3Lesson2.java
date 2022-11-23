// Computer Science
// Lesson 2
// Week of May 4th

// Now, let's add some stuff to our first lesson
// PLEASE BE SURE TO CLOSE LESSON 1 BEFORE YOU COMPILE THIS FILE!!!!!!!!!!!!!!!!!!!!!!!!

// NOTE - when you compile this file, it will overwrite the previous Gradebook.class file -- that's okay!

import java.util.*;

public class Ch3Lesson2
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("***** WELCOME TO THE SUPER SMINGA DELUXE GRADEBOOK PROGRAM *****");
    System.out.println();
    System.out.print("Please enter the name of the course: ");
    
    // We get input here, as we did in Chapter 2's programs, using nextLine from Scanner
    String name = input.nextLine();
    
    // Create a Gradebook object
    Gradebook gb = new Gradebook();
    
    // Remember, if we tried to type "gb.courseName = name", it would give an error, because courseName is private!
    
    // Set the course name - note, it must be called from the gb object we just made. Also note the parameter, "name"
    gb.setCourseName(name);
    
    System.out.println("I'm so glad you decided to take " + gb.getCourseName());
    
    // To call the toString() method, we can either call it by using the name
    System.out.println(gb.toString());
    
    // But, a shortcut! toString() is a special method (see below), so if we have one created, we can just print
    //  the object without calling toString() by name!
    System.out.println(gb);
  }
}

class Gradebook
{
  // Here we are adding a private String variable to the class so the object knows the name of the course
  private String courseName;
  
  // And we remember that every variable in a class should have its own set and get methods!
  // If there was a quick, easy way to check if what we entered is a valid course name, we'd do it, but alas...
  
  // Notice how I went out of my way to name the parameter in the method below the exact same name as the variable
  //  in the class? You don't HAVE to do it that way, BUT if you DO, we use the "this" keyword with the variable
  //  on the left to indicate we're talking about the class variable, as the variable on the right of the equals
  //  sign is the parameter name, since variables in statements like this are stored from right to left!
  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }
  
  // Remember, the whole point of having private variables is so that we can't just access them without
  //  public methods. It doesn't mean very much with Strings, as in this example, but when we do numerical data
  //  it matters a great deal! We don't want things like negative lengths, grades that are 999%, etc...
  public String getCourseName()
  {
    return courseName;
  }
    
  // Finally, we replaced "displayMessage" with toString()
  //  toString() is a special method that all objects in Java should have
  //  Notice, it's not void! It returns a String. Yes, it must be set up like this.
  
  // Also, keep in mind, we can access courseName directly here rather than using the getCourseName() method
  //  because we are "inside of" the class!
  public String toString()
  {
    return "Gradebook for " + courseName;
  }
}

