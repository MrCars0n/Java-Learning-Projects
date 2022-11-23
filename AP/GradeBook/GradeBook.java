// GradeBook Class File - not runnable (no main method)
// 10-1-20
// Period 4
// Carson Kramer

public class GradeBook
{
  // variables in a class are typically declared as private. We can only access them through the means of a public method
  private String courseName;
  private int period;
  
  // constructor - sets default values of object or to specific values being sent in class creation
  // 2 or more methods with same name but different parameters, called method overloading
  
  // constructors don't have return types (not even void), must have same name as class itself
  // specific constructor
  public GradeBook(String courseName, int period)
  {
    // In constructor, you rely on set methods
    setCourseName(courseName);
    setPeriod(period);
  }
  
  // default constructor
  public GradeBook()
  {
    setCourseName("");
    setPeriod(1);
  }
  
  public void setPeriod(int period)
  {
    if (period >= 1 && period <= 9)
    {
      this.period = period;
    }
    else
    {
      this.period = 1;
    }
    
  }
  
  
  // we create set and get methdos to access/change those private values
  public void setCourseName(String courseName)
  {
    // set the class variable equal to the method's parameter
    this.courseName = courseName;
  }
  
  // methods (functions) of the class
  // methods are typically declared public
  public void welcomeMessage()
  {
    System.out.println("Welcome to my " + courseName + " gradebook!");
    System.out.println("Period = " + period);
  }
}