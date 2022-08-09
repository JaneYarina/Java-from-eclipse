package com.sytax.class07;

public class class07loop {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
			
			System.out.println("--------------------");
			
			int x=10;
			x=x+1;//11
			System.out.println(x);
			x+=1;//12
			System.out.println(x);
			x=x++;//postincrement value by 1 (addition kills itself)
			System.out.println(x);//nothing 
			++x;//increment value by 1
			System.out.println(x);//13
			x--;
			System.out.println(x);//12
			
		}

	}

}
