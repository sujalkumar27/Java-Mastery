
public class SumOfDigits {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number: ");
		int a =sc.nextInt();
		int sum=0;
		int i=1;
		while (i<=a) {
			sum=sum+(a%10);
			a=a/10;
		}System.out.println("sum = "+sum);
		sc.close();
	}
}
