import java.util.Scanner;
public class ArrayEx6 {
	public static void sum(int arr[]) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if (sum==0) {
			for(int i=0;i<arr.length;i++) { 
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[] =new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the values: ");
			arr[i]=sc.nextInt();
			if (arr[i]==0){
				System.out.println("Please do not enter 0");
				break;
			}
		}
		sum(arr);
		System.out.println("Enter the number: ");
	
	}
	
	
}