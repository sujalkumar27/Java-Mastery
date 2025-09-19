
public class Ques10MultiplicationIn2D2 {
	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 ,4}, { 1, 1, 1, 2 }, { 1, 1,2,5 } };
		int g = 1;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {

				g *= a[x][y];
			}
		}
		System.out.println("Multiplication of all the numbers is: " + g);
	}
}
