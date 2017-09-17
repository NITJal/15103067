
abstract public class ShapeAbstract {
	public abstract void numberOfSides();
	public static void main(String args[])
	{
		Trapezoid t=new Trapezoid();
		Hexagon h=new Hexagon();
		Triangle tr=new Triangle();
		t.numberOfSides();
		h.numberOfSides();
		tr.numberOfSides();
	}
}
class Trapezoid extends ShapeAbstract{
	public void numberOfSides()
	{
		System.out.println("Number of sides in trapezoid is 4");
	}
}
class Hexagon extends ShapeAbstract{
	public void numberOfSides()
	{
		System.out.println("Number of sides in hexagon is 6");
	}
}
class Triangle extends ShapeAbstract{
	public void numberOfSides()
	{
		System.out.println("Number of sides in triangle is 3");
	}
}