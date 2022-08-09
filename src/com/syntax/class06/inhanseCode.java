package com.syntax.class06;

import java.util.Scanner;

public class inhanseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);

System.out.println("Enter your Quiz score");
int num1 = input.nextInt();
System.out.println("Enter your Mid-term score");
int num2 = input.nextInt();
System.out.println("Enter your Final score");
int num3 = input.nextInt();

int result = ((num1+num2+num3)/3);

if (result >= 90) {
	System.out.println("Your grade is A");
}else if(result>=70 && result<=90) {
	System.out.println("Your grade is B");
}else if(result>=50 && result<=70) {
	System.out.println("Your grade is C");
}else if(result<50) {
	System.out.println("Your ghreat is F");
}
}
}
