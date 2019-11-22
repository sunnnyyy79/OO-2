abstract class CSharp
{
  protected String color;
  public void setColor(string str)
  {
    color=str;
  }
  public abstract void show();
}

class CTriangle extends CShape
{
  protected double a;
  protected double b;
  protected double c;
  public CTriangle (double a,double b,double c)
  {
    a = A;
    b = B;
    c = C;
  }
  public void show()
  {
  system.out.print("color="+color+", ");
  system.out.println("area="+0.5*a*b);
}

public class homework{
    public static void main(String args[])
    {
        Cshape shape1 = new CTriangle(3,4,5);
        shape1.setColor("Red");
        shape1.show();
    }
}
