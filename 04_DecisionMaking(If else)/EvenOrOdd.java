// find even or odd
public class EvenOrOdd {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number: ");
		int a= sc.nextInt();
		if (a%2==0){
			System.out.println(a+" is an even number");
		}else {
			System.out.println(a+" is an odd number");
		}
		
				
	}

}
