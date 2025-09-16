import java.util.Scanner;
public class FunctionEx8 {
	static void show(String s) { 
		System.out.println("The entered string is "+s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.next();
		show(s);
		sc.close();
		
	}
}
	