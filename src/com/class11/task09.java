package com.class11;

public class task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Maximum and min number in the array
		int [] array= {10,20,50,5,8};
		int maxNumber=array[0];
		int minNumber=array[0];
		 for(int num:array) {//: means for each num in array we are goint to compare
			 if(num>maxNumber) {//if num more then assumed maxNumber
				maxNumber=num;//then we switch that number to num and it is going
				              //to be maxNumber
				
			 }
			 if(num<minNumber) {
				 minNumber=num;
			 }
		 }
		 
		 System.out.println(maxNumber+" "+minNumber);
	}
	

}
// we will pick 1st number and compare with 2nd number
/*we assuming that 10 is largest number and if it is not true that 
 * we have to update maxNumber
 * 
 */
	