class overload
{
  public void display(String a)
  {
    System.out.println(a);
  }
  public void display(int a)
  {
    System.out.println("integer no: "+a);
  }
  public void display(float a)
  {
    System.out.println("float no: "+a);
  }
}
class overloading {
  public static void main(String[] args) {
    overload o=new overload();
    o.display(null);
    o.display(5);
    o.display(5.60f);
  }
}
