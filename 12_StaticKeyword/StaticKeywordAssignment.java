//class s {
//	static int x;
//
//	void m() {
//		x++;
//		System.out.println(x);
//	}
//
//	static void setX(int a) {
//		x = a;
//	}
//}
//
//class StaticKeywordAssignment {
//	public static void main(String[] args) {
//		s a = new s();
//		System.out.println(a.x);
//		a.m();
//		s.setX(15);
//		a.m();
//	}
//}

//class Demo {
//	int x = 1;
//	static int y = 20;
//
//	void show() {
//		System.out.println(x);
//		System.out.println(y);
//	}
//}
//class StaticKeywordAssignment {
//	public static void main(String[] args) {
//		Demo d1 = new Demo();
//		Demo d2 = new Demo();
//		Demo d3 = new Demo();
//		d1.x = 20;
//		d1.y = 30;
//		d2.x = 40;
//		d2.y = 50;
//		d3.x = 60;
//		d3.y = 70;
//		d1.show();
//		d2.show();
//		d3.show();
//	}
//}

//class T {
//	static int x;
//
//	static void m() {
//		x++;
//	}
//	static void show() {
//		System.out.println(x);
//	}
//}
//class StaticKeywordAssignment {
//	public static void main(String[] args) {
//		System.out.println(T.x);
//		T.m();
//		T.m();
//		T.show();
//}}

class StaticKeywordAssignment{
	static int x;
	int y;
	void m(int a) {
		y=a;
	}
	public static void main(String[] args) {
		System.out.println(StaticKeywordAssignment.x);
		StaticKeywordAssignment a= new StaticKeywordAssignment();
		a.m(4);
		a.x=3;
		System.out.println(StaticKeywordAssignment.x);
		System.out.println(a.y);
		System.out.println(a.x);
}}