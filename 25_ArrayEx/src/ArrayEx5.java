public class ArrayEx5 {
	public static void main(String[] args) {
		int a[]={8,3,10,5,7,2,4,5,1,5};
		
		//access array elements in reverse
		for(int x=a.length-1;x>=0;x--) {
			System.out.println(a[x]);
		}
		//access array elements by skipping one
		for(int x=0;x<a.length;x+=2) {
			System.out.println(a[x]);
		}
	}
}