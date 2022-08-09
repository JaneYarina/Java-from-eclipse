package com.class11;

import java.util.Scanner;

public class Dog {
// we didnt assine the dog yet just made a plan how he would looks like
// we created properties 
//then we are going to write the rules where we are going to solve problems
//attributes how the object will look like
	String name;
	int age;
	double weight;  //properties attributes fields
	String color;
	double height;
	String breed;
	//how that object behave
	void bark() {//bark is the name of the method
		// void is key word specifies that a method should not hav
		System.out.println("Dog barks");
	}
	void walks() {
		System.out.println("Dog walks");
	}
	
	void eat() {
		System.out.println("Dogs like to eat bone");
	}
	
	public static void main (String[] arg) {//creatin an object and soring in a variable	
Scanner scanner=new Scanner(System.in);//cmd+click 
scanner.next();
Dog jimmy=new Dog(); //we assined an object by = , keyword NEW and repeating the class and ()
jimmy.name="Jimmy";
jimmy.age=6;
jimmy.weight=16;
jimmy.color="black";
jimmy.height=2.6;
jimmy.breed="German";
jimmy.bark();//start assinig behavior

}
}
