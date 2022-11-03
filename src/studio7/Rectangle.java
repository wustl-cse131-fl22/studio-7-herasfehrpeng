package studio7;

public class Rectangle {
	private double height;
	private double length;
	
	public Rectangle(double initHeight, double initLength)
	{
	height = initHeight;
	length = initLength;
	}
	
	public double area()
	{
		return height*length;
	}
	
	public double perimeter()
	{
		return 2*(height+length);
	}
	
	public boolean square()
	{
		if (height == length) return true;
		else return false;
	}
	
	public boolean isSmaller(Rectangle r)
	{
		if (this.area() > r.area())
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(4,4);
		System.out.println("Rectangle1 dimensions: " + rectangle1.height + " by " + rectangle1.length);
		System.out.println("Area: " + rectangle1.area());
		System.out.println("Perimeter: " + rectangle1.perimeter());
		System.out.println("Square? " + rectangle1.square());
		System.out.println();
		
		Rectangle rectangle2 = new Rectangle(5,3);
		System.out.println("Rectangle2 dimensions: " + rectangle2.height + " by " + rectangle2.length);
		System.out.println("Area: " + rectangle2.area());
		System.out.println("Perimeter: " + rectangle2.perimeter());
		System.out.println("Square? " + rectangle2.square());
		System.out.println();
		
		System.out.println("The area of Rectangle1 is greater than the area of Rectangle2: " + rectangle1.isSmaller(rectangle2));
	}
}
