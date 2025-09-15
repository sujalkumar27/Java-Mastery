class Stu{
	String name;
	int age;
	String fathername;
	int fees;
	String schoolname;
	void input(String a,int b,String c,int d,String e) {
		name =a;
		age =b;
		fathername=c;
		fees=d;
		schoolname=e;
	}void show(){
		System.out.println(name+" "+age+" "+fathername+" "+fees+" "+schoolname);
	}
}
public class StudentEx2 {
	
	public static void main(String[] args) {
		Stu o1=new  Stu();
		 Stu o2=new  Stu();
		 Stu o3=new  Stu();
		 Stu o4=new  Stu();
		 o1.input("ram", 12, "ramesh", 5000," abc");
		 o2.input("prianshu", 12, "ghaseeta ram", 5000," abc");
		 o3.input("abhay", 12, "dr jhatka", 5000," abc");
		 o4.input("pramod", 12, "kirmada", 5000," abc");
		 
		 o1.show();
		 o2.show();
		 o3.show();
		 o4.show();
		 
		
		
	}

}
