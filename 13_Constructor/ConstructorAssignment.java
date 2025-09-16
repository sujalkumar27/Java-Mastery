//class S {
//	int x = 10;
//	String y = "Rahul";
//
//	S() {
//		x = 12;
//		System.out.println("Hi");
//	}
//}
//
//public class ConstructorAssignment {
//	public static void main(String[] args) {
//		S a = new S();
//		System.out.println(a.x);
//		System.out.println(a.y);
//	}
//}

class Demo {
	static int x;
	int y;

	Demo() {
		System.out.println("Hello");
		x = 20;
		y = 10;
	}

	static {
		System.out.println("Hi");
	}
}

public class ConstructorAssignment {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d2.x);
		System.out.println(d2.y);
	}
}