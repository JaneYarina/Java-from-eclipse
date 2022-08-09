package com.class11;

public class Car {

String model;
String make;
String color;
int year;
String typeOfEngine;
int NoOfDoors;
int HP;
 void MoveForward() {
	 System.out.println("Car is mooving forward");
 }
 void reverse() {
	 System.out.println("Moviing backwards");
 }
 public static void main(String[] args) {
	Car bmw=new Car();
	bmw.model="X6";
	bmw.make="BMW";
	bmw.color="black";
	bmw.year=2022;
	bmw.typeOfEngine="V8";
	bmw.HP=500;
	System.out.println(bmw.model);
	bmw.MoveForward();
	bmw.reverse();
	
	Car lexus=new Car();
	lexus.make="Lexus";
	lexus.model="LFA";
	lexus.color="pink";
	lexus.MoveForward();
	
	}

 }
 
	


