
public class Circle extends A implements Shape {
	private double ar;
	public void findArea(){ 
		double r=2.3;
		ar=3.14*r*r;
	}
	public void printArea(){
		System.out.println("Circle's Area: "+ar);
		show();
	}
}