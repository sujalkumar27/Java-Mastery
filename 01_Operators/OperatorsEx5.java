
public class OperatorsEx5 {

	public static void main(String[] args) {
		int a=10,b;
		//b=a++;
		//b=++a;
		//b=a++ - a;
		//b=++a - a;
		//b=a++ - a++ -a;
		//b=++a - a++;
		b=--a+a++-a++-a;
		//b=a++-++a+a--+a++;
		//b=a++*a--/++a+a--%a++;
		//b=a+++a;
		//b=a+++++a;//error
		b=a+++ ++a;
		System.out.println(a);
		System.out.println(b);
	}

}
