
public class ForLoopEx3 {
	public static void main(String[] args) {
		for(int x=1;x<=5;x++,System.out.println("Hi")) { 
			System.out.println("Rahul Chauhan");
		}
		System.out.println("-------");
		for(int x=1;x<=5;x++,System.out.println("Hi"),System.out.println("Ok")) { 
			System.out.println("Rahul Chauhan");
		}
		System.out.println("-------");
		for(int x=1;x<=5;x++,System.out.println("Hi"),System.out.println("Ok")) { 
			System.out.println("Rahul Chauhan");
			System.out.println("Hello");
		}

		System.out.println("-------");
		int x=1;
		for(System.out.println("Hello");x<=5;x++,System.out.println("Hi")) { 
			System.out.println("Rahul Chauhan");
		}
	}

}
