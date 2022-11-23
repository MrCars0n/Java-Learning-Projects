// CV School District Employee Hierarchy
// 3-8-21

// Superclass of Teachers, Administrators, Support Staff
public class Employee
{
  private String lastName;
  private String firstName;
  
  public Employee()
  {
  }
  
  public Employee(String fn, String ln)
  {
    setFirstName(fn);
    setLastName(ln);
  }
  
  public void setFirstName(String fn)
  {
    firstName = fn;
  }
  
  public void setLastName(String ln)
  {
    lastName = ln;
  }
  
  public String getFirstName()
  {
    return firstName;
  }
  
  public String getLastName()
  {
    return lastName;
  }
  
  public String toString()
  {
    return String.format("Last Name = %s, First Name = %s", getLastName(), getFirstName());
  }
}