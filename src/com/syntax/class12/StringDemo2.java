package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
	/*isEmpty
	 * 
	 */
		String firstName="Adem";
		String lastName=" jones";
		String fullName= firstName+lastName;// always always prefer this
		String fullName2=firstName.concat(lastName);//never use this because it can lead
		//you to nullpointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name="";
		boolean a=name.isEmpty();
		System.out.println(a);
		//System.out.println(name.isBlank());//
		
		String capitain=" ne  ver ";//it is removing space before and afterword, not in beween
		System.out.println(" ne ver ");
		String america="10"+capitain.trim()+"together";
System.out.println(america.trim());
		
	}

}
