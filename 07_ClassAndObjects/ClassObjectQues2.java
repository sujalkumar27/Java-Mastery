class AAR{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQues2 {
	public static void main(String[] args) {
		AAR a=new AAR();
		a.x=10;
		AAR b=new AAR();
		b.y="Ram";
		a.show();
		b.show();
	}
}