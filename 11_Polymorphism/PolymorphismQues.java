class X{
	int a=10;
	void m1() {
		System.out.println("Hi X");
	}
	static void m2() {
		System.out.println("Hello X");
	}
}
class Y extends X{
	int a=20;
	void m1() {
		System.out.println("Hi Y");
	}
	static void m2() {
		System.out.println("Hello Y");
	}
	void display() {
		System.out.println("Ok Y");
	}
}
public class PolymorphismQues {
	public static void main(String[] args) {
		X x=new X();
		x.m1();
		x.m2();
		System.out.println(x.a);
		x=new Y();
		x.m1();
		x.m2();
		//x.display();//error
		System.out.println(x.a);
		Y y=new Y();
		y.m1();
		y.m2();
		System.out.println(y.a);
		y.display();
	}
}