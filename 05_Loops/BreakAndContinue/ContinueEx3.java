
public class ContinueEx3 {
	public static void main(String[] args) {
		int x=1;
		do{ 
			System.out.println("Hello");
			x++;
			if(x==3) {
				continue;
			}
			System.out.println("Sujal Kumar");
		}while(x<=5);

		//interview questions
		//print 1 to 10 except 3,7 using continue statement
		for(int i=1;i<=10;i++) {
			if(i==3 || i==7) {
				continue;
			}
			System.out.println(i);
		}
	}




}
