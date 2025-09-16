
public class PrimeNo {
	public static String prime(int n) {
		String r = "";
		if (n <= 1) {
			r = n + " is NOT Prime";
		} else {
			boolean flag = true;
			for (int x = 2; x <= n / 2; x++) {
				if (n % x == 0) {
					r = n + " is NOT Prime";
					flag = false;
					break;
				}
			}
			if (flag) {
				r = n + " is Prime";
			}
		}
		return r;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number to check prime or not: ");
		int n = sc.nextInt();
		String r = prime(n);
		System.out.println(r);
		;
		sc.close();
	}
}
