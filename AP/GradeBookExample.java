// Chapter 3 & 8
// 2-8-21

// File name = class name
// NOTE; Not runnable, need driver class (test class)
public class GradeBookExample
{
  // Variables = private
  private String className;
  
  // Constructors = special methods in class to set default variable values
  //  No return types, same name as class
  public GradeBookExample(String className)
  {
    // This = reference to current class / object
    // Set parameter classname = THIS class's className
    this.className = className;
  }
  
  // Default constructor - overloaded methods
  public GradeBookExample()
  {
    this.className = "-- default --";
  }
  
  // Variables have sets and gets
  
  // Sometimes called "accessors"
  public void setClassName(String className)
  {
    this.className = className;
  }
  
  // Sometimes called "accessors"
  public String getClassName()
  {
    return className;
  }
  
  // Methods = class functions = public to access private variables
  // Void = no return
  public void displayMessage()
  {
    System.out.println("Welcome to my " + className + " grade book!");
  }
  
  // .toString() method allows to "print class"
  public String toString()
  {
    return "GradeBook for " + className;
  }
}