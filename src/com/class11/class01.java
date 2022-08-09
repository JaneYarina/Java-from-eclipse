package com.class11;

import java.util.Arrays;
import java.util.Scanner;

public class class01 {

	public static void main(String[] args) {
		
//using Scanner create an array of Integer values. After the array is created,
		//calculate the sum of all stored elements in that array.
		
Scanner scan=new Scanner(System.in);//use scanner
System.out.println("Please enter the size of the array that you want to create");
int arraySize=scan.nextInt();//integer variable to store the size
System.out.println("the size of the array is "+arraySize);//cancatination operation 
int [] integerArray=new int[arraySize];//create array of the size(int)
// for(int element;integerArray) {//advanced for loop.not useful because we can only
//acsess elements only for reading the value it is not for storing or modifying the value
//we can't use it for inserting or updating the values of an array
System.out.println("please enter "+arraySize+" elements");


for(int i=0;i<integerArray.length; i++)	{//int i=0 is starting point; i<integerArray.Length is condition
//Why?i<integerArray.Length?		
// why? i++
// now we have exes to the index
	integerArray[i]=scan.nextInt();//take the values from the user with help of scanner(scan.nextInt()),
//and store the value inside of array for all the alterations to repeat
}
System.out.println(Arrays.toString(integerArray));//to print out element of the arrey with the help of (Arrays.toString)

//elements have been stored in array, now addition of elements
int sum=0;
for(int element:integerArray) {
	sum=sum+element;
	
	
}
System.out.println("The sum of all the elements is "+sum);
	
		
	}

}
