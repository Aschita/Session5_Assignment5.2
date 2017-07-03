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

public class Triangle extends Figure {
	private final double a, b, c;
	
	public Triangle(){
		this(1,1,1);
	}
	
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	//Method to calculate the Area of Triangle
	double findArea() {
		// TODO Auto-generated method stub
		// Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	//Method to calculate the Perimeter if Triangle
	double findPerimeter() {
		// TODO Auto-generated method stub
		 // P = a + b + c
        return a + b + c;
	}
}
