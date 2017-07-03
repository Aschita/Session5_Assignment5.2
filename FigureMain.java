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

//Main Method

public class FigureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Rectangle test
        double width = 5, length = 7; //declaring the length and breath of rectangle
        Figure rectangle = new Rectangle(width, length); //creating an object of class rectangle
        
      //Printing and call the findArea and findPerimeter methods of the class Rectangle

        
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.findArea()
                + "\nResulting perimeter: " + rectangle.findPerimeter() + "\n");

        // Circle test
        double radius = 5; //declaring the radius of the circle
        Figure circle = new Circle(radius); // creating an object of class circle
      
        //Printing and call the findArea and findPerimeter methods of the class Circle
        
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.findArea()
            + "\nResulting Perimeter: " + circle.findPerimeter() + "\n"); 
        
        // Triangle test
        double a = 5, b = 3, c = 4; //declaring the sides of the triangle
        Figure triangle = new Triangle(a,b,c); //creating and object of class Triangle
        
      //Printing and call the findArea and findPerimeter methods of the class Triangle
        
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.findArea()
                + "\nResulting Perimeter: " + triangle.findPerimeter() + "\n");
        
	}

}
