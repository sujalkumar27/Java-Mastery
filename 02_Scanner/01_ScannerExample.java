
public class ScannerExample {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner( System.in );
		
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		System.out.println("Entered Number: "+a);
		
		System.out.println("Enter a FloatingPoint Number: ");
		double b=sc.nextDouble();
		System.out.println("Entered FloatingPoint Number: "+b);
		
		System.out.println("Enter a Single word String: ");
		String c=sc.next();
		System.out.println("Entered String: "+c);
	}

}
