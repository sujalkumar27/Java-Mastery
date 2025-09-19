import java.util.Scanner;
public class ArrayEx3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter array size:");
		int n=sc.nextInt();
		int []a=new int[n] ;
		System.out.println("Plz enter "+n+" Array elements:");
		for(int x=0;x<a.length;x++) {
			a[x]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int x:a) {
			System.out.println(x);
		}
		//sum of array elements:
		int sum=0;
		for(int x:a) {
			sum += x;
			
		}
		System.out.println("Sum of Array Elements: "+sum);
	}
}