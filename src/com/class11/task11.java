package com.class11;

public class task11 {

	public static void main(String[] args) {
		// write a program to find second largest number
		
int []arr= {10,20,5,6,8,200};

	int maxNumber=arr[0];//10
	int secondLargest=arr[0];//10
	for(int num:arr) {
		if(num>maxNumber) {
			secondLargest=maxNumber;
			maxNumber=num;
			
		}
		if(num>secondLargest&& secondLargest<maxNumber && num<maxNumber) {//&& is and
		
			secondLargest=num;
		
		}
	}
		System.out.println(maxNumber);
		System.out.println(secondLargest);
		
		
		
	}

}
