// GradeBookRunner file - is runnable (has a main method)

public class GradeBookRunner
{
  public static void main(String args[])
  {
    // Class creation expression - creating an "instance" (gb) of the GradeBook object
    GradeBook gb = new GradeBook("AP Computer Science", 2);
    
    //gb.setCourseName("AP Computer Science");
    
    gb.welcomeMessage();
  }
}