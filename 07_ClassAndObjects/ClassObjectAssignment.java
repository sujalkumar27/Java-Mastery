//class Aa {
//	int x = 10;
//	String y = "Rahul";
//
//	void show() {
//		System.out.println(x + y);
//	}
//}
//
//class Test {
//	public static void main(String[] args) {
//		Aa a = new Aa();
//		Aa b = new Aa();
//		a.x = 15;
//		a.show();
//		a.y = "YoYo";
//		b.show();
//		b.y = "Ramu";
//		a.show();
//		b.show();
//	}
//}

class Animal {
	String name;
	private int age;
	String color;

	void input() {
		name = "xyz";
		age = 15;	
	}

	void show() {
		System.out.println(name + age + color);
	}
}

class ClassObjectAssignment {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.show();
		a.input();
		Animal b = new Animal();
		a.show();
		b.show();
	}
}

//class Are {
//	private int x;
//
//	public void show() {
//		x++;
//		System.out.println(x);
//	}
//
//	public static void main(String[] args) {
//		Are a = new Are();
//		a.show();
//		Are b = new Are();
//		a.show();
//		b.show();
//	}
//}

//class Demo {
//	int p = 1;
//
//	public void m(int x) {
//		p = x;
//	}
//
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.p = 3;
//		System.out.println(d.p);
//		d.m(4);
//		System.out.println(d.p);
//	}
//}
