public class PatternEx12 {
	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		for (int x = 1; x <= a; x++) {
			
			for (int z = 1; z <= b; z++) {
				System.out.print("*");

			}
			if(x<=a/2) b--;
			else b++;

			System.out.println();

		}
	}
}
