public class Rectangle extends A implements Shape {
	private double ar;
	public void findArea(){ 
		double l=9.2,b=8.5;
		ar=l*b;
	}
	public void printArea(){
		System.out.println("Rectangle's Area: "+ar);
		show();
	}
}