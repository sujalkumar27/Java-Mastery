public class ArrayEx1 {
	public static void main(String[] args) {
		//int a[4];//error
		int []a;//allowed    	//Array Declaration
		//int a[];//allowed  	//Array Declaration
		a=new int[4]; //Array Creation
		//Array Initialization
		a[0]=8;
		a[1]=9;
		a[2]=10;
		a[3]=5;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		
		for(int x:a) {
			System.out.println(x);
		}
		
	}
}