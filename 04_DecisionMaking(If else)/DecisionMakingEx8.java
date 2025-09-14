// Write a program to find the greatest among 5 numbers.
public class GreatestAmong5No {

	public static void main(String[] args) {
		java.util.Scanner sc =new java.util.Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int c = sc.nextInt();
		System.out.println("Enter the 4th number: ");
		int d= sc.nextInt();
		System.out.println("Enter the 5th number: ");
		int e = sc.nextInt();
		if (a>b && a> c && a>d && a>e) {
			System.out.println(a+ " is greatest");
		}
		else if (b>c && b>d && b>e) {
			System.out.println(b+" is greatest");
		}
		else if ( c>d && c>e) {
			System.out.println(c+" is greatest");
		}
		else if (d>e) {
			System.out.println(d+" is greatest");
		}
		else {
			System.out.println(e+" is greatest");
		}
		
	}

}
