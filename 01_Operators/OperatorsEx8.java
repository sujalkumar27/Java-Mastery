public class OperatorsEx8 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int c = a++ != --b ? ++a * b++ / --a + b-- : ++b - ++a * b-- % ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
