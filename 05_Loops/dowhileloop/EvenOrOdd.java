
public class EvenOrOdd {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String c;
		do {
			System.out.println("Enter the number: ");
			 int a=sc.nextInt();
			if (a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}System.out.println("Do you want to continue [yes/no] ");
			c=sc.next();
			}while(c.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using even odd app!");
	}
}
