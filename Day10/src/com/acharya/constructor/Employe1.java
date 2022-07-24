package com.acharya.constructor;

public class Employe1 {
	int id;
	String name;
	float salary;
	//Constructor
	Employe1(){
		System.out.println("User defined No-arg constructor is called");
	}
	//User defined parameterized constructor
	public Employe1(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe1 e1 = new Employe1(11,"Hemanth",5000f);
	     Employe1 e2 = new Employe1(22,"Hemu",5000f);
	     e1.display();
	     e2.display();
	}

}
