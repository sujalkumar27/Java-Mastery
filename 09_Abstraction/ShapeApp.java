//In this example, we demonstrate abstraction using an abstract class Shape and its subclasses Circle, Rectangle, and Triangle. Each subclass provides its own implementation of the abstract method findArea().
// The ShapeApp class tests the functionality of these classes.
public class ShapeApp {

	public static void main(String[] args) {
		Shape s;
		// s=new Shape();//error
		s = new Circle();
		s.findArea();
		s.printArea();
		s = new Rectangle();
		s.findArea();
		s.printArea();
		s = new Triangle();
		s.findArea();
		s.printArea();

		Shape s1 = new Circle();
		s1.findArea();
		s1.printArea();
		Shape s2 = new Rectangle();
		s2.findArea();
		s2.printArea();
		Shape s3 = new Triangle();
		s3.findArea();
		s3.printArea();
}}