class Student{
	String name;
	int age;
	String fathername;
	int fees;
	String schoolname;
}
public class StudentEx1 {
	
	public static void main(String[] args) {
		Student o1=new Student();
		Student o2=new Student();
		Student o3=new Student();
		Student o4=new Student();
		
		o1.name="ram";
		o1.age=17;
		o1.fathername="phoolchand";
		o1.fees=5000;
		o1.schoolname="matra";
		
		o2.name="raj";
		o2.age=17;
		o2.fathername="phoolchand";
		o2.fees=5000;
		o2.schoolname="matra";
		
		o3.name="heera thakur";
		o3.age=17;
		o3.fathername="mamchand";
		o3.fees=5000;
		o3.schoolname="matra";
		
		o4.name="shyam";
		o4.age=17;
		o4.fathername="dharam";
		o4.fees=5000;
		o4.schoolname="matra";
		System.out.println(o1.name+" "+o1.age+" "+o1.fathername+" "+o1.schoolname+" "+o1.fees);
		System.out.println(o2.name+" "+o2.age+" "+o2.fathername+" "+o2.schoolname+" "+o2.fees);
		System.out.println(o3.name+" "+o3.age+" "+o3.fathername+" "+o3.schoolname+" "+o3.fees);
		System.out.println(o4.name+" "+o4.age+" "+o4.fathername+" "+o4.schoolname+" "+o4.fees);
		
	}

}
