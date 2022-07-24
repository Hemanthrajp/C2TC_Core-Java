package com.acharya.thiskey;

public class Student {
	void display() {
		System.out.println(this);
		System.out.println("in display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println(s1);
		s1.display();
	}

}
