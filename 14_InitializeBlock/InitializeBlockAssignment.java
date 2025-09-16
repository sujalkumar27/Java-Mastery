//class Emp{
//	String name;
//	Emp() {
//	System.out.println("Hello Emp");
//	name="Rahul";
//	}
//	static{
//	System.out.println("Hi Emp");
//	}
//	{
//	System.out.println("I am Emp");
//	}
//	}
//	class InitializeBlockAssignment{
//	public static void main(String[] args) {
//	Emp e1= new Emp();
//	Emp e2= new Emp();
//	System.out.println(e1.name);
//	}
//	}

class A {
	int x;
	static int y;

	A() {
		System.out.println("Hi A");
	}

	A(int a) {
		x = a;
		System.out.println("Hello A");
	}

	static {
		y = 15;
		System.out.println("Class Loaded");
	}
	{
		System.out.println("Object Created");
	}
}

class InitializeBlockAssignment
{
	public static void main(String[] args) {
		System.out.println(A.y);
		A a = new A();
		A a2 = new A(4);
		System.out.println(a.x);
		System.out.println(a2.x);
	}
}
