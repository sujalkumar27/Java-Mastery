
public class SquareOfNumber {
	static int square(int a) {
		return a*a ;
	}
	public static void main(String[] args) {
		java.util.Scanner sc =new java.util.Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		int b=square(a);
		System.out.println("Square: "+b);
		}

}
