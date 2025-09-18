
public class PatternEx5 {
	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		int c = 5;
		for (int x = 1; x <= a; x++) {
			for (int y = 1; y <= c; y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= b; y++) {
				System.out.print("*");
			}
			b+=2;
			c--;
			System.out.println();

		}
	}
}
