
public class Ques6GreatestAmong2D {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{5,3,4,8},{5,11,5}};
		int g=a[0][0];
		for (int x=0;x<a.length;x++) {
			for (int y=0;y<a[x].length;y++) {
				if (g<a[x][y]) {
					g=a[x][y];
				};
			}
		}System.out.println("greatest number among the given number is: "+g);
}}

