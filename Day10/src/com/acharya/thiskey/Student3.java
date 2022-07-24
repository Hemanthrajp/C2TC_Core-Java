package com.acharya.thiskey;

public class Student3 {
	Student3(){
		System.out.println("hello");
	}
	Student3(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 a = new Student3(10);
	}

}
