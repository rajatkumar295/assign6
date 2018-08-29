class vehicle
{
  public void start()
  {
    System.out.println("vehicle Start");
  }
  public void stop()
  {
    System.out.println("vehicle stop");
  }
}
  class twowheeler extends vehicle
  {
    public void start()
  {
    System.out.println("two wheeler Start");
  }
  public void stop()
  {
    System.out.println("two wheeler Stops");
  }
  }
  class fourwheeler extends vehicle
  {
    public void start()
  {
    System.out.println("four wheeler Start");
  }
  public void stop()
  {
    System.out.println("four wheeler Stop");
  }
  }
class Main {
  public static void main(String[] args) {
    vehicle a=new twowheeler();
    a.start();
    a.stop();
    a=new fourwheeler();
    a.start();
    a.stop();
  }
}