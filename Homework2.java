interface Shape
{
  abstract void getArea()
}

class Rectangle implements Shape
{
  double length;
  double width;
  public Rectangle(int w, int l)
  {
    length = l;
    width = w;
  }

  public void getArea()
  {
    system.out.println(“Rectangle=”+width*length);
  }

  public String toString()
  {
  return “Area = “;
  }

}

class Triangle implements Shape
{
  double base;
  double height;
  public Rectangle(int b, int h)
  {
    base = b;
    height = h;
  }

  public void getArea()
  {
    system.out.println(“Triangle=”+base*height*0.5);
  }

}
