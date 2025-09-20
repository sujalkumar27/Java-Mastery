public class StringEx9 {
	public static void main(String[] args) {
		String s1=new String("Rahul");//String is Immutable
		s1.concat("Incapp");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Rahul");//StringBuilder is Mutable
		s2.append("Incapp");
		System.out.println(s2);
	}
}