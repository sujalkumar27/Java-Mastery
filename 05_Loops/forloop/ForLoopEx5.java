
public class ForLoopEx5 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a no.: ");
		int a=sc.nextInt();
		int sum=0;
		for(int x=1;x<=a;x++) { 
			sum += x;
			System.out.print(x);
			if(x!=10) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum);
	}
}
