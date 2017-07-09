package Java_Assignment52;
/*
 * This class will help to master the Methods,Abstract classes and Object Creation concepts. 
 */
import java.util.Scanner;
public class Java_Assignment5_2 
{	
	public static void main(String[] args) 
	{
		 Circle obCircle=new Circle();
		 obCircle.findArea();
		 obCircle.findPerimeter();
		 Rectangle obRect=new Rectangle();
		 obRect.findArea();
		 obRect.findPerimeter();
		 Triangle obTriangle=new Triangle();
		 obTriangle.findArea();
		 obTriangle.findPerimeter();

	}

}
abstract class Figure // Abstract class 
{
    abstract void findArea(); // Abstract method
    abstract void findPerimeter(); // Abstract method
    double dim1; //member data
}
class Circle extends Figure //Derived class from  abstract class
{ 
	Scanner get = new Scanner(System.in);
	double r;
    void findArea() // defined the defination for findArea method by overriding the abstract function
    {
    	System.out.print("\nEnter Radius of Circle in meter: ");
    	r = get.nextDouble();
    	dim1=3.14f*r*r; //Calculating the area
    	System.out.println("\nThe area of Circle is : ="+dim1 +" square meters.");
    }
    void findPerimeter() // defined the defination for findPerimeter method by overriding the abstract function
    {
    	dim1=2*3.14f*r; //Caculating the Perimeter
    	System.out.println("The Perimeter of Circle is : ="+dim1 +" meters.");
    }
}
class Rectangle extends Figure //Derived class from  abstract class
{ 
	Scanner get = new Scanner(System.in);
	double l;
	double b;
    void findArea() // defined the defination for findArea method by overriding the abstract function
    {
    	System.out.print("\nEnter Length of Rectangle in meter: ");
    	l = get.nextDouble();
    	System.out.print("\nEnter breadth of Rectangle in meter: ");
    	b = get.nextDouble();
    	dim1=l*b; //Calculating the area
    	System.out.println("\nThe area of Rectangle is: "+dim1+" square meters.");
    }
    void findPerimeter() // defined the defination for findPerimeter method by overriding the abstract function
    {
    	dim1=2*(l+b);
    	System.out.println("The Perimeter of Rectangle is :"+dim1+" meters.");
    }
}
class Triangle extends Figure //Derived class from  abstract class
{ 
	Scanner get = new Scanner(System.in);
	double h;
	double b;
	double l;
    void findArea() // defined the defination for findArea method by overriding the abstract function
    {
    	System.out.print("\nEnter Height of Triangle in meter: ");
    	h = get.nextDouble();
    	System.out.print("\nEnter Base of Triangle in meter: ");
    	b = get.nextDouble();
    	System.out.print("\nEnter diagonal of Triangle in meter: ");
    	l= get.nextDouble();
    	dim1=(h*b)/2;  //Calculating the area
    	System.out.println("\nThe area of Triangle is: "+dim1+" square meters.");
    }
    void findPerimeter() // defined the defination for findPerimeter method by overriding the abstract function
    {
    	dim1=l+b+h; //Caculating the Perimeter
        System.out.println("The Perimeter of Triangle is: "+dim1 +" meters.");
	}
}

