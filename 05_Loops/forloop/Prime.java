
public class Prime {

	public static boolean findPrime(int n) {
		if(n<=1) {
			return false;
		}else {
			boolean flag=true;
			for(int x=2;x<n/2;x++) {
				if(n%x==0) {
					System.out.println(n+" is NOT Prime");
					flag=false;
					break;
				}
				
			}return true;
		}
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number to check prime or not: ");
		int n=sc.nextInt();
		boolean result=findPrime(n);
		if(result) {
			System.out.println(n+" is Prime");
		}
		else {
			System.out.println(n+" is NOT Prime");
		}
//		if(n<=1) {
//			System.out.println(n+" is NOT Prime");
//		}else {
//			boolean flag=true;
//			for(int x=2;x<n/2;x++) {
//				if(n%x==0) {
//					System.out.println(n+" is NOT Prime");
//					flag=false;
//					break;
//				}
//			}
//	if(flag) {
//		System.out.println(n+" is Prime");
//			}
			
//	}

}
}