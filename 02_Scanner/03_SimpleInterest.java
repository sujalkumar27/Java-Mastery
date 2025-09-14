
public class SimpleInterest {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		double a= sc.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double b= sc.nextDouble();
		System.out.println("Enter the time interval in years: ");
		double c= sc.nextDouble();
		double s= a*b*c/100;
		System.out.println("The Simple Interest is: "+s);
	}

}
