// Computer Science
// Lesson 3
// Week of May 4th

// PLEASE BE SURE TO CLOSE LESSON 1 AND LESSON 2 BEFORE YOU COMPILE THIS FILE!!!!!!!!!!!!!!!!!!!!!!!!
// NOTE - when you compile this file, it will overwrite the previous Gradebook.class file -- that's okay!

// Let's finish our Gradebook class (for now) by adding in.... constructors!

// BE SURE TO READ THE NOTE AT THE END OF THIS FILE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.util.*;

public class Ch3Lesson3
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("***** WELCOME TO THE SUPER SMINGA DELUXE GRADEBOOK PROGRAM *****");
    System.out.println();
    
    System.out.print("Please enter the name of the first course: ");
    String name1 = input.nextLine();

    System.out.print("Please enter the name of the second course: ");
    String name2 = input.nextLine();
    
    // Here, we'll create two Gradebook objects using the specific contructor
    Gradebook gb1 = new Gradebook(name1);
    Gradebook gb2 = new Gradebook(name2);
    
    // And here, we'll create a Gradebook object using the default constructor, since we didn't specify a name
    Gradebook gb3 = new Gradebook();
    
    System.out.println(gb1);
    System.out.println(gb2);
    System.out.println(gb3);    
  }
}

class Gradebook
{
  private String courseName;
  
  public Gradebook()
  {
    setCourseName("Unnamed test course");
  }
  
  public Gradebook(String courseName)
  {
    // Could we simply say "this.courseName = courseName" here (and above in the default)? Sure!
    //  But, why not just call the set method? This is a simple example, but if you have a meticulous set method
    //  with 95 lines of code, would you want to re-code it here? Of course not! Code smarter, not harder.
    
    setCourseName(courseName);
  }
  
  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }
  
  public String getCourseName()
  {
    return courseName;
  }
  
  public String toString()
  {
    return "Gradebook for " + courseName;
  }
}

// Hello!
//
// After you finish this file, please go to page 89 in the Java textbook and enter the Account class
//  and the AccountTest class on page 90-91 to see another example. Next week, you'll be creating your own
//  classes and test files for a grade, so be sure to ask any questions you may have now this week!

