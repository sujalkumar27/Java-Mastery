import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Please enter" + n + "arrays elements: ");
		for (int x = 0; x < a.length; x++) {
			a[x] = sc.nextInt();
		}int s=0;
		for(int x=0;x<a.length;x++) {
			if (a[0]<a[x]) {
				s=a[x];
				}
			}
		
		System.out.println("Maximum value is " + s);

	}

}
