package com.palak.overriding_example;

public class Test {
	public static void main(String[] args) {
		
		Animal animal=new Dog();
		
		Animal.run();
		animal.eat();
		
	}

}
