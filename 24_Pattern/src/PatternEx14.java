public class PatternEx14 {
	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		int c = 0;
		for (int x = 1; x <= (a); x++) {
			for (int y = 1; y <= c; y++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= b; z++) {
				System.out.print("* ");

			}if(x<=a/2) {c++;b--;}
			else {c--;b++;}

			System.out.println();

		}
	}
}
