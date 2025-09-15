
public class ClassObjectExample1 {
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		
		//System.out.println(name);//error
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="Gogo Singh";
		a.salary=98000;
		a.cname="ABC";
		
		b.name="Lalu Gupta";
		b.salary=21;
		b.cname="JAIL";
		
		c.name="Teja Kumar";
		c.salary=7800;
		c.cname="XYZ";
		
		d.name="Heera Lal";
		d.salary=26000;
		d.cname="PQR";
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
	}
}
class Employee{
	String name;
	int salary;
	String cname;
}


