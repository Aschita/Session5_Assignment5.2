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

public class Circle extends Figure{

	private final double radius;
    final double pi = Math.PI;
    
    public Circle(){
    	this(1);
    }

    public Circle(double radius){
    	this.radius = radius;
    }

	@Override
	//Method to calculate the area of Circle
	double findArea() {
		// TODO Auto-generated method stub
		// A = π r^2
        return pi * Math.pow(radius, 2);

	}

	@Override
	//Method to calculate the perimeter of Circle
	double findPerimeter() {
		// TODO Auto-generated method stub
		// P = 2πr
        return 2 * pi * radius;
	}
	
    
}
