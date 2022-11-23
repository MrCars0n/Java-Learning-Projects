// Carson Kramer
// 10-6-20
// Period 4
// Address Runner

public class AddressRunner
{
  public static void main(String args[])
  {
    Address ad1 = new Address(1, "Main St", "Harrisburg", "PA", 17025);
    Address ad2 = new Address(2, "Main St", "Harrisburg", "PA", 17000, 1);
    ad1.print();
    ad2.print();
    ad1.compareTo(ad2);
  }
}