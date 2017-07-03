//Assignment 5.2
//Create an abstract class Figure with following properties and functions:
//Properties:
//double dim1;
//Methods: abstract void
//findArea(); abstract void
//findPerimeter();
//Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both
//the methods. Write a program that will find the area and perimeter of 3 Figures and print the
//details for all.


package assignment_5b;

public class Rectangle extends Figure{
	private final double width, length;
	
	public Rectangle(){
		this(1,1);
	}
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	@Override
	//Method to calculate the Area
	public double findArea() {
		// TODO Auto-generated method stub
		// A = w * l
		return width * length;
	}

	@Override
	//Method to calculate the Perimeter
	public double findPerimeter() {
		// TODO Auto-generated method stub
		// P = 2(w + l)
		return 2 * (width + length);
		
		}
}
