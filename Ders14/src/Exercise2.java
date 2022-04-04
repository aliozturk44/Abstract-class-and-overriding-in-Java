import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter three sides: ");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		
		Triangle triangle= new Triangle(a,b,c);
		
		System.out.print("enter the color: ");
		String color=scan.next();
		triangle.setColor(color);
		
		System.out.print("enter a boolean value for filled: ");
		boolean filled=scan.nextBoolean();
		triangle.setFilled(filled);
		
		System.out.println("the area is " + triangle.getArea());
		System.out.println("the perimeter is "+ triangle.getPerimeter());
		System.out.println(triangle);
	}
}

class Triangle extends GeometricObject{
	private double side1=1.0,side2=1.0,side3=1.0;

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double getArea() {
		double u,a,alan;
		u=(side1+side2+side3)/2;
		a=u*(u-side1)*(u-side2)*(u-side3);
		alan= Math.pow(a, 0.5);
		
		// TODO Auto-generated method stub
		return alan;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side1+side2+side3;
	}
	
	
}
