
public class AddApp {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a= sc.nextInt();
		System.out.println("Enter the second number: ");
		int b= sc.nextInt();
		int s=a+b;
		System.out.println("Sum is: "+s);
		sc.close();
	}

}
