package com.syntax.class04;

public class assignment {

	public static void main(String[] args) {
		/* solve a value whether user has diploma or not
		 *  if user has diploma we want to see --> congratulations
		 *  otherwise -->suggest to get a degree
		 *  if user has degree program should check a gpa score
		 *  if gpa is higher or 3.5 --> you are eligible for scholarship
		 *  otherwise -->you should have studied harder
		 */
		boolean hasDiploma=true;
		int gpa = 4;
		
		if (hasDiploma) {
			System.out.println("Congratulatios");
			if(gpa>=3.5) {
				System.out.println("you are eligible");
			}else {
				System.out.println("you should have studied harder");
			}
			
		}else {
			System.out.println("you should have studied harder");
			
				
			}
		
	
		}
	}


