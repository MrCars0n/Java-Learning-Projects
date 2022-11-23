// Employee Class - used with Date
//  Date = member of this class for employee's birthday

// Composition - use one class as member of another ("has a" relationship)
// Inheritance - one class is subclass of another ("is a" relationship)

// Employee HAS A birthday (date)
// Square IS A rectangle

public class Employee
{
  private String firstName;
  private String lastName;
  private Date birthday;
  
  public Employee()
  {
    setFirstName("null");
    setLastName("null");
    setBirthday(new Date());
  }
  
  public Employee(String first, String last, Date dob)
  {
    setFirstName(first);
    setLastName(last);
    setBirthday(dob);
  }
  
  public void setFirstName(String first)
  {
    firstName = first;
  }
  
  public void setLastName(String last)
  {
    lastName = last;
  }
  
  public void setBirthday(Date dob)
  {
    birthday = dob;
  }
  
  public String getFirstName()
  {
    return firstName;
  }
  
  public String getLastName()
  {
    return lastName;
  }
  
  public Date getBirthday()
  {
    return birthday;
  }
  
  public String toString()
  {
    return String.format("%s, %s\t%s", lastName, firstName, birthday);
  }
}