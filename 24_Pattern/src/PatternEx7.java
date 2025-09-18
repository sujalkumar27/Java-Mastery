import java.util.*;

public class PatternEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = 11;
		int b = 1;
		int c = 4;
		for (int x = 1; x <= (a); x++) {
			for (int y = 0; y <= c; y++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= b; z++) {
				System.out.print("*");

			}
			if(x<a/2) { b+=2; c--;}
			  
			else { b-=2;c++;}
			
			System.out.println();

		}
	}
}
