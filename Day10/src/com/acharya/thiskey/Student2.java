package com.acharya.thiskey;

public class Student2 {
	int rollno;
	String name;
	float fees;
	public Student2(int r, String n,float f) {
		rollno=r;
		name=n;
		fees=f;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2(101,"Hemanth",5000f);
		Student2 s2 = new Student2 (102,"Hemu",5000f);
		s1.display();
		s2.display();
	}

}
