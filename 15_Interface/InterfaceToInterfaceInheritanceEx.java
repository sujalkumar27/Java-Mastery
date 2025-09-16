 abstract interface Are{
	void m1();
	void m();
}
interface BB{
	void m2();
	void m();
}
interface CC extends Are,BB{
	void m3();
}
interface DD {
	void m4();
}
class XA implements CC,DD{
	@Override
	public void m1() {
		System.out.println("hello1 X");
	}
	@Override
	public void m() {
		System.out.println("hello2 X");
	}
	@Override
	public void m2() {
		System.out.println("hello3 X");
	}
	@Override
	public void m3() {
		System.out.println("hello4 X");
	}
	public void show() {
		System.out.println("OK X");
	}
	@Override
	public void m4() {
		System.out.println("HiD X");
	}
}
public class InterfaceToInterfaceInheritanceEx {
	public static void main(String[] args) {
		Are a=new XA();
		a.m();
		a.m1();
		//a.m2();//error
		//a.m3();//error
		//a.m4();//error
		//a.show();//error
		BB b=new XA();
		b.m();
		b.m2();
		//b.m1();//error
		//b.m3();//error
		//b.m4();//error
		//b.show();//error
		CC c=new XA();
		c.m();
		c.m1();
		c.m2();
		c.m3();
		//c.m4();//error
		//c.show();//error
		DD d=new XA();
		d.m4();
		//d.m();//error
		//d.m1();//error
		//d.m2();//error
		//d.m3();//error
		//d.show();//error
		XA x=new XA();
		x.m();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		x.show();
	}
}
