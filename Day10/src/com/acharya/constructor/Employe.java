package com.acharya.constructor;

public class Employe {
	int id;
	String name;
	float salary;
	//Constructor
	Employe(){
		System.out.println("User defined No-arg constructor is called");
	}
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1 = new Employe();
	     Employe e2 = new Employe();
	     e1.display();
	     e2.display();
	}

}
