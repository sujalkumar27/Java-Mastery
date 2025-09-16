
public class ShapeApp {

	public static void main(String[] args) {
		System.out.println(Shape.x);
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
		System.out.println(s.x);

		
	}

}
