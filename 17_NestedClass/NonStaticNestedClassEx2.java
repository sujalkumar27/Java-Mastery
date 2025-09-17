class S{
	private int h=8;
	int x=10;
	static int z=7;
	S(){
		System.out.println("Constructor run of super class");
	}
	static {
		System.out.println("Static method run of super class");
	}
	void m1() {
		System.out.println("Hello S");
		System.out.println(h);
		System.out.println(z);
		System.out.println(x);
		T b=new T();
		System.out.println(b.k);
	}
	class T{
		int y=20;
		private String l="sujal";
		static int k=14;
		T(){
			System.out.println("Constructor run of sub class");
		}
		static {
			System.out.println("Static method run of sub class");
		}
		void m2() {
			System.out.println("Hello T");
			System.out.println(h);
			System.out.println(x);
			System.out.println(z);
			System.out.println(l);
			
		}
		
	}
}
class NonStaticNestedClassEx2{
	public static void main (String s[]) {
		System.out.println(S.T.k);
		S v=new S();
		v.m1();
		System.out.println(v.x);
		S.T a=v.new T();
		a.m2();
		System.out.println(a.y);
		
		
		
	}
}