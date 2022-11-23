// Carson Kramer
// 5-17-20
// Period 5
// 3.14 Employee Class

import java.util.*;

public class EmployeeTest
{
 public static void main(String args[])
 {
   Scanner input = new Scanner(System.in);
   
   System.out.println("***********************EMPLOYEE DIRECTORY***********************");
   System.out.println();
   
   System.out.print("Enter the first name of employee 1: ");
   String firstName1 = input.nextLine();
   
   System.out.print("Enter the last name of employee 1: ");
   String lastName1 = input.nextLine();
   
   System.out.print("Enter the monthly salary of employee 1: ");
   String monthlySalary1 = input.nextLine();
   
   System.out.print("Enter the first name of employee 2: ");
   String firstName2 = input.nextLine();
   
   System.out.print("Enter the last name of employee 2: ");
   String lastName2 = input.nextLine();
   
   System.out.print("Enter the monthly salary of employee 2: ");
   String monthlySalary2 = input.nextLine();
   
   Employee e1 = new Employee(firstName1, lastName1, Double.parseDouble(monthlySalary1));
   Employee e2 = new Employee(firstName2, lastName2, Double.parseDouble(monthlySalary2));
   Employee e3 = new Employee();
   
   e1.print();
   e2.print();
   e3.print();
   
   e1.setMonthlySalary(e1.getMonthlySalary() * 1.1);
   e2.setMonthlySalary(e2.getMonthlySalary() * 1.1);
   e3.setMonthlySalary(e3.getMonthlySalary() * 1.1);
   
   e1.print();
   e2.print();
   e3.print();
 }
}

class Employee
{
  private String firstName;
  private String lastName;
  private double monthlySalary;
  
  // Constructors
  public Employee()
  {
    setFirstName("<First Name>");
    setLastName("<Last Name>");
    setMonthlySalary(0.0);
  }
  
  public Employee(String fName, String lName, Double mSal)
  {
    setFirstName(fName);
    setLastName(lName);
    setMonthlySalary(mSal);
  }
  
  // Sets
  public void setFirstName(String name)
  {
    firstName = name;
  }
  
  public void setLastName(String name)
  {
    lastName = name;
  }
  
  public void setMonthlySalary(Double sal)
  {
    if (sal >= 0)
    {
      monthlySalary = sal;
    }
  }
  
  // Gets
  public String getFirstName()
  {
    return firstName;
  }
  
  public String getLastName()
  {
    return lastName;
  }
  
  public double getMonthlySalary()
  {
    return monthlySalary;
  }
  
  public void print()
  {
    System.out.printf("%s, %s\t\t$%.2f per month\n\n", lastName, firstName, monthlySalary);
  }
}