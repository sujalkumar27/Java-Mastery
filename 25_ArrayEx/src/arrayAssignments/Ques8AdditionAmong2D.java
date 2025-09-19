
public class Ques8AdditionAmong2D {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 ,4}, { 5, 3, 4, 8 }, { 5, 10, 5 } };
		int g = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {

				g += a[x][y];
			}
		}
		System.out.println("Sum of all the numbers is: " + g);
	}
}
