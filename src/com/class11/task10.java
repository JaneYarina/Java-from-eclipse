package com.class11;

import java.util.Arrays;

import javax.sound.midi.MidiSystem;

public class task10 {

	public static void main(String[] args) {
// write a java program to find the second largest number in the array?
	int[]arr= {10,20,5,6,8,9,200};
	System.out.println(Arrays.toString(arr));//Arrays.toString method?
	                                         //we need to sort them out
	                                         //10, 20, 5, 6, 8, 9, 200]
	Arrays.sort(arr);//method to sort
	System.out.println(Arrays.toString(arr));//5, 6, 8, 9, 10, 20, 200]
	System.out.println(arr[0]);//5
	System.out.println(arr[arr.length-1]);//200 [] is array, priznat variables
	System.out.println(arr[arr.length-2]);//20
	System.out.println(arr.length-1);//?6
	System.out.println(arr.length-3);//?4 we have 7 numbers. 7-3=4
	}

}
