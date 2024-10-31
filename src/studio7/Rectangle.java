package studio7;

public class Rectangle {

	private double length;
	private double width;
	private double perimeter;
	private double area;
	
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public void calculatePerimeter() {
		perimeter = length*2+width*2;
	}
	
	public void calculateArea() {
		area = length*width;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getArea() {
		return area;
	}
	
	public boolean compareTo(Rectangle r) {
		if (this.getArea()>r.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean checkSquare() {
		if (length==width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String result = "Length: " + length + ", " + "Width: " + width + ", " + "Perimeter: " + perimeter + ", " + "Area: " + area + ".";
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Rectangle r1 = new Rectangle(4,4);
		Rectangle r2 = new Rectangle(3,4);
		r1.calculateArea();
		r1.calculatePerimeter();
		r2.calculateArea();
		r2.calculatePerimeter();
		
		System.out.println(r1.getPerimeter());
		System.out.println(r1.getArea());
		System.out.println(r2.getPerimeter());
		System.out.println(r2.getArea());
		System.out.println(r1.compareTo(r2));
		System.out.println(r1.checkSquare());
		System.out.println(r2.checkSquare());
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}
	

}
