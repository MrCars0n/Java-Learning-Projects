// Computer Science
// Lesson 1
// Week of May 4th

// Chapter 3 - Classes

// Below, you will find two classes, one public and one not.
//  The public class is the primary class of this file, as you've done thus far in Java
//  The public class contains the main function (method) and must have the same name as your file.

public class Ch3Lesson1
{
  // A static method, like main, is special, because you can call it
  //  without first creating an object of the class in which the method is declared...
  
  public static void main(String args[])
  {
    // Here, we create an "instance" of a Gradebook object, and we call it "gb"
    //  We use the "new" keyword to do this. Think of the left side of the equals sign like
    //  declaring a variable (int x, for example), and the right side is "constructing" the class with "new"
    Gradebook gb = new Gradebook();
    
    // Remember what I said wrote above about the keyword static?
    //  In order to call displayMessage, we had to first create an instance (object) of Gradebook, called gb
    //  We use the dot operator, the object name on the left and the method name on the right!
    //  Don't forget the parentheses, as you're calling a function/method
    gb.displayMessage();
  }
}

// In C++, we would have done this in another file. In Java, you can still do this, but for the sake of
//  ease and brevity, I've put this in the same file. 

// Note, it's just a class, not a public class. The public class is the file (same name), 
//  and it contains the main function. Note, as always, the class name is capitalized.

// Finally, while "Gradebook" is not the primary class in this file, when you compile this file,
//  it will make two .class files, one for Ch3Lesson1 and one for Gradebook

class Gradebook
{
  // We'll start easy. No private variables, no constructors, etc...
  //  This is just a simple class with a simple function. It simply prints a message, so there's nothing to return.
  //  Therefore, it's a void function. In Java, we call functions "methods". The subtle difference is that
  //  methods are functions which are tied to a class. Don't worry too much about this difference right now.
  
  // Also note, the method name is lower-case!
  // ALSO note, we do not use the keyword static here, as we do with the main method.
  public void displayMessage()
  {
    System.out.println("Welcome to Computer Science!");
  }
}

