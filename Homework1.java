class CTriangle extends CShape
{
  protected double a;
  protected double b;
  protected double c;
  public CTriangle (int A,int B,int C)
  {
    double a = A;
    double b = B;
    double c = C;
  }
  public void show()
  {
  system.out.print("color="+red+", ");
  system.out.println("area="+0.5*a*b);
}
