import java.util.Scanner;
public class Ques3Frequency1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of the array: " );
		int a[]= new int[b];
		//System.out.println("Please enter "+b+" array element: ");
		for (int x=0;x<a.length;x++) {
			a[x]=sc.nextInt();
		}
		// System.out.println("Your array's values are: "+a);
//		int a[] = { 1, 2, 2, 4, 34, 3, 4, 2, 1, 36, 1, 1, 33, 3, 3, 3 };
		
		for (int x = 0; x < a.length; x++) {
			boolean flag = true;

			for (int i = 0; i < x; i++) {

				if (a[x] == a[i]) {

					flag = false;
					break;
				}
			}

			if (flag) {
				int count = 0;
				for (int y = 0; y < a.length; y++) {
					if (a[x] == a[y]) {
						count++;
					}
				}
				System.out.println(a[x] + " occured " + count + " times");
			}
		}

	}
}
