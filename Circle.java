package shape;
public class Circle
{
  private int radius;
  public Circle(int r)
{ 
  radius=r;
}
public double area()
{
  return(3.14*radius*radius);
}
}