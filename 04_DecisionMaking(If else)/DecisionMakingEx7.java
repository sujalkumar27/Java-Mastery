//Divisible by 5 and 3
public class DivisibleBy5and3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Number..");
		int a= sc.nextInt();
	    if(a%5==0 && a%3==0) {
	    	System.out.println(a+ " is a Divisible by 5&3");
	    } else {
			System.out.println(a+" is not Divisibe by 5&3");
			}
						
	}
}


