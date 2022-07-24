package com.acharya.statickey;

public class Static4 {
	int rollno;
	String name;
	static String college;
	static {
		college = "ITIS";
	}
	Static4(int r,String n){
		rollno = r;
		name = n;
	}
	static void change() {
		college = "BBDIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static4 s1 = new Static4(111,"Preeti");
		Static4 s2 = new Static4(222,"Harshi");
		change();
		s1.display();
		s2.display();
	}

}
