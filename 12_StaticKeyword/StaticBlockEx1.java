class Animal{
	String name;
	int age;
	static String color="White";
	void show() {				
		System.out.println(name+" "+age+" "+color);
	}
	void input(String n,int a) {
		name=n;
		age=a;
	}
	static void display() {
		System.out.println("Hi Animal");
		System.out.println(color);
		//System.out.println(name);//error
	}
	static {
		System.out.println("Hello Animal");
		System.out.println(color);
		//System.out.println(name);//error
	}
}
public class StaticBlockEx1 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		Animal.color="Red";
		Animal a=new Animal();
		Animal b=new Animal();
		Animal c=new Animal();
		
		a.input("Dog", 4);
		b.input("Cat", 6 );
		c.input("Tiger", 9);
		
		a.show();
		b.show();
		c.show();
		
		Animal.display();
	}
	static {
		System.out.println("INCAPP");
	}
}