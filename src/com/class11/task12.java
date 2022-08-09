package com.class11;

public class task12 {

	public static void main(String[] args) {
		//break 1
		// write a program to print out duplicate elements from an Array 
		//of Strings?
		//              0    1     2    3    4
		String[] arr= {"aa", "b", "c", "a", "b"};//01234 numbers of array=4
		for (int i=0; i<arr.length; i++) {// i=0 weare startin with "aa". 
			//i<arr.length - as long as i is less than array.length,we continue looping
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])&& i!=j) {//i!=j becouse we need differenn array but with the same name 
					//b!=b becouse 1!=4
					System.out.println(arr[i]+arr[j]);
				}
			}
		}

	}

}
