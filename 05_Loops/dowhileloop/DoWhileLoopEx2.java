
public class DoWhileLoopEx2 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		String c;
		do {
			System.out.println("Enter a no.: ");
			int a=sc.nextInt();
			System.out.println("Square: "+a*a);
			
			System.out.println("Do you wanna continue: [yes/no]");
			c=sc.next();
		}while(c.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for using my Square App!");
	}


}
