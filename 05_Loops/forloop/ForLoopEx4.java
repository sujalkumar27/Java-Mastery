
public class ForLoopEx4 {
	public static void main(String[] args) {
		for(int x=1;x<=10;x++) { 
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x=1;x<=10;x+=2) { 
			System.out.print(x+" ");
		}
		System.out.println();
		int sum=0;
		for(int x=1;x<=10;x++) { 
			sum += x;
		}
		System.out.println("Addition: "+sum);
	}

}
