package com.acharya.statickey;
class Student1 {
	int rollno;
	String name;
	static String college = "Acharya";
	
	public Student1(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1 = new Static(111,"Hemanth");
    	Static s2 = new Static(112,"Anusha");
    	s1.display();
    	s2.display();
	}

}
