
public class FunctionEx3 {
	static int add() {
		int a=10, b=20;
		int r=a+b;
		return r;
		//return 5;
		//System.out.println("bye");//error
	}
	public static void main(String[] args) {
		int result=add();
		System.out.println("Sum: "+result);
	}
}