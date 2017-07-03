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

public abstract class Figure {
	double dim1;
	abstract double findArea();
	abstract double findPerimeter();
}


