// Driver Class
public class GradeBookRunner
{
  // Static = can be called without first creating object of class in which it is declared
  public static void main(String args[])
  {
    // Java = extensible language - create own data types
    
    // Class instance creation expression - keyword new creates an instance of an object
    //  (gb = specific object from GradeBook template)
    
    // Calls default constructor (pre-made)
    // GradeBookExample gb = new GradeBookExample();
    
    // If you create constructor with parameters, need to create blank one too
    GradeBookExample gb = new GradeBookExample("Calculus");
    
    // Dot = apostrophe showing object's ownership
    gb.displayMessage();
    
    gb.setClassName("AP Computer Science A");
    System.out.println("the new name of the course is " + gb.getClassName());
    
    // Each class has .toString() to print line below. Don't need to put method to use it
    System.out.println(gb);
  }
}