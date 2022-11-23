// Hierarchy Test File
// 3-8-21

public class EmployeeTest
{
  public static void main(String args[])
  {
    Employee e1 = new Employee();
    System.out.println(e1);
    
    Employee e2 = new Employee("Steve", "Franco");
    System.out.println(e2);
    
    Teacher t1 = new Teacher();
    System.out.println(t1);
    
    Teacher t2 = new Teacher("Jamie", "Patterson", 45000);
    System.out.println(t2);
    
    SupportStaff s1 = new SupportStaff("Elon", "Musk", 40, 15);
    System.out.println(s1);
  }
}