package com.syntax.class13;

public class task3 {

	public static void main(String[] args) {
		// write a program that reads two people's first name and if they 
		//expecting boy or girl
		//suggest a name for a baby
		/*example output:
		 * Mom's first name? Mary
		 * Dad's first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: DANRY
		 * Example Output:
		 * Mom's first name? Mary
		 * Dad's first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: MAIEL
		 */
String father="Sameer";
String mother="Taylor swift";
boolean boy=false;//if true boy otherwise girl 
if(boy) {
	String firstHalf=mother.substring(0,mother.length()/2);
	String secondHalf=mother.substring(mother.length()/2);
	System.out.println(firstHalf.trim()+secondHalf.trim());

}else {
	String firstHalf=mother.substring(0,mother.length()/2);
	String secondHalf=father.substring(father.length()/2);
	System.out.println(firstHalf.trim()+secondHalf.trim());
	
}
		
		
		
		
		
	}

}
