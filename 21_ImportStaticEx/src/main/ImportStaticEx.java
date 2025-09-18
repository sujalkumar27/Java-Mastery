package main;
import p1.A;
//import static p1.*;//error
//import p1.A.*;//error
//import static p1.A.y;
//import static p1.A.m2;
import static p1.A.*;
//static import p1.A.*;//error

import java.lang.*;//by default imported
import javax.swing.JFrame;

public class ImportStaticEx {
	public static void main(String[] args) {
		System.out.println(y);
		m2();
		
		A a=new A();
		System.out.println(a.x);
		a.m1();
		
		System.out.println(Math.PI);
		JFrame f=new JFrame();
		f.setVisible(true);
	}
}