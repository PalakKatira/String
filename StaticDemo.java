package com.palak.static_example;

public class StaticDemo {

	public static void staticMethod() {
		System.out.println("Static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("Non Static method");
	}
	
	public void TestMethod() {
		
		//both are valid
		staticMethod();
		StaticDemo.staticMethod();
		
		nonStaticMethod();
		this.nonStaticMethod();
	
		StaticDemo.nonStaticMethod();
	}
	
	public static void TestMethod1() {
		
		//both will work
		staticMethod();
		StaticDemo.staticMethod();
		
		//this wont work
		nonStaticMethod();
		this.nonStaticMethod();
		
		//this works because we have a concrete instance of object
		StaticDemo sd=new StaticDemo();
		sd.nonStaticMethod();
		
		//this wont work
		StaticDemo.nonStaticMethod();
	}
}
