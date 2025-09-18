public class PatternEx9 {
	public static void main(String[] args) {
		int a = 11;
		int b = 1;
		int c = 4;
		for (int x = 1; x <= (a); x++) {
			for (int y = 1; y <= c; y++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= b; z++) {
				System.out.print("*");

			}
			if (x < a / 2) {
				b++;
				c--;
			}

			else {
				b--;
				c++;
			}

			System.out.println();

		}
	}
}
