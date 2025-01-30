
public class Rectangle {
	double length;
	double breadth;
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		double res=length*breadth;
		return res;
		 
	}
	public static void main(String args[])
	{

		Rectangle r=new Rectangle(5678.43,4749.43);
		double res1=r.area();
		System.out.println(res1);
	}
}
