
public class PrimeUsingDoWhile {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String c;
		do{
			System.out.println("Enter a no.: ");
			int n=sc.nextInt();
			if(n<=1) {
				System.out.println(n+" is NOT Prime");
			}else {
				boolean flag=true;
				for(int x=2;x<n/2;x++) {
					if(n%x==0) {
						System.out.println(n+" is NOT Prime");
						flag=false;
						break;
					}
				}
				if(flag) {
					System.out.println(n+" is Prime");
				}
			}
			System.out.println("Do you want to continue [yes/no] ");
			c=sc.next();
		}while( c.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using app!");
	}
}
