public class Address
{
  private int houseNumber;
  private int apartmentNumber = 0;
  private String street;
  private String city;
  private String state;
  private int postalCode;
  
  public Address(int houseNumber, String street, String city, String state, int postalCode)
  {
    setHouseNumber(houseNumber);
    this.street = street;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
  }
  
  public Address(int houseNumber, String street, String city, String state, int postalCode, int apartmentNumber)
  {
    setHouseNumber(houseNumber);
    setApartmentNumber(apartmentNumber);
    this.street = street;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
  }
  
  public void setHouseNumber(int houseNumber)
  {
    if (houseNumber > 0)
    {
      this.houseNumber = houseNumber;
    }
    else if (houseNumber < 0)
    {
      this.houseNumber = -houseNumber;
    }
    else
    {
      this.houseNumber = 1;
    }
  }
  
  public void setApartmentNumber(int apartmentNumber)
  {
    if (apartmentNumber > 0)
    {
      this.apartmentNumber = apartmentNumber;
    }
    else if (apartmentNumber < 0)
    {
      this.apartmentNumber = -apartmentNumber;
    }
    else
    {
      this.apartmentNumber = 1;
    }
  }
  
  public void compareTo(Address ad1)
  {
    if(postalCode > ad1.getPostalCode())
    {
      System.out.println(postalCode + " > " + ad1.getPostalCode());
    }
    else if (postalCode < ad1.getPostalCode())
    {
      System.out.println(postalCode + " < " + ad1.getPostalCode());
    }
    else
    {
      System.out.println(postalCode + " = " + ad1.getPostalCode());
    }
  }
  
  public void print()
  {
    if(apartmentNumber != 0)
    {
      System.out.println(houseNumber + " " + street + ", Unit " + apartmentNumber);
    }
    else
    {
      System.out.println(houseNumber + " " + street);
    }
    System.out.println(city + ", " + state + " " + postalCode);
  }
  
  public int getPostalCode()
  {
    return postalCode;
  }
}