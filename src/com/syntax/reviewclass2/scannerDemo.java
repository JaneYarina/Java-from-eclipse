package com.syntax.reviewclass2;

import java.util.Scanner;

public class scannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner=new Scanner(System.in);

System.out.println("Please Enter your name");
int name=scanner.nextLine();

scanner.nextLine();

System.out.println("Please Enter your age");
String age=scanner.nextInt();

System.out.println(name+age  +  "where this will be printed");

	}

}
