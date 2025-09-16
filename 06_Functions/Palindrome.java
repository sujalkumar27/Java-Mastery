
public class Palindrome {
	static String palindrome(int n) {
		String s = "";
		String c="";
		int num = 0;
		int i = 0;
		int a = n;
		while (i < a) {
			num = num * 10 + (a % 10);
			a /= 10;
		}
		if (num == n) {
			s = n + " is palindrome";
		} else {
			s = n + " is not palindrome";
		}
		return s;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		String s = palindrome(n);
		System.out.println(s);
		System.out.println("Thanks! for using this app");
		sc.close();
	}

}
