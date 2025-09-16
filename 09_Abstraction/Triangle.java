
public class Triangle  extends Shape {
	private double ar;
	public void findArea(){ 
		double b=6.4,h=7.1;
		ar=b*h/2;
	}
	public void printArea(){
		System.out.println("Triangle's Area: "+ar);
	}
}