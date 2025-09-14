
public class DecisionMakingEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner( System.in );
		
		System.out.println("Enter Age: ");
		int a=sc.nextInt();
		if(a>=10 && a<=16) {
			System.out.println("You are Teenager!");
		}else {
			System.out.println("you are not teenager");
		}
		System.out.println("Bye App");
	}


}
