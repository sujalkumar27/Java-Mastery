package p1;

//import p2.B;//error
import p1.p2.B;

public class A {
	public void m() {
		B b=new B();
		System.out.println(b.y);
	}
}
