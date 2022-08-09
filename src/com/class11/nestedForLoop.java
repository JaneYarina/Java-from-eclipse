package com.class11;

public class nestedForLoop {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println("-------");
		}
	// number of stars is = to i; stars are printed i times; 
	//1) i=1, 1<5(condition is true) then j=1 and j<=i(true)
	//then we print a *
    //then we incremented j++ and now j=2 
	//then we return to i=1 is 2<=1(j<=i):false we are done with loop 1)
	//then we are going to print System.out.println("-------");
	//then we increment i++ now i=2 and 2<=5(true)
	//then j=1 and 1<=2 then we print a *
	//we increment j and j=2 check j<=i(2<=2)(true) and we print another *
	//we icremented j and j=3 check j<=i(3<=2)(false) the we are going to 
	//System.out.println("-------");
//it will continue till we will print 5 stars if i=6 i<=5(false) We are done 
//we are done with out lined loop
		
	
	
	
	}
	
	
	
	
	
	
	

}
