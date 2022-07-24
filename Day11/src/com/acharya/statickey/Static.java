package com.acharya.statickey;

public class Static {
	int rollno;
	String name;
	static String college = "AIT";
	Static(int r,String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1 = new Static(111,"Hemanth");
    	Static s2 = new Static(112,"Anusha");
    	s1.display();
    	s2.display();
	}

}
