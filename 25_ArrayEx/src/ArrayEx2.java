
public class ArrayEx2 {
	public static void main(String[] args) {
		int a[]=new int[4];
		a[1]=132;
		a[0]=324;
		a[2]=34;
		a[3]=345;
		//int a[];
//		a=new int[] {4,24,45,5};//allowed
//		a=new int[4] {4,24,45,5};//error
//		a= {4,24,45,5};//error
		
//		int a[]=new int[]{8,3,10,5};//allowed
		//int a[]=new int[4]{8,3,10,5};//error
		
		
		int b[]={8,3,10,5};//now, new int[] is skip able 
		int c[]= {3,5,56,43};
		for(int x:a)
			System.out.println(x);		
	}
}
