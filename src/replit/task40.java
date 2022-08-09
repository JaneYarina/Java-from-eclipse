package replit;

import java.util.Scanner;

public class task40 {

	public static void main(String[] args) {
		 
		
		
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter name of the instructor");
		  String name=scan.next();
		  String out;
		  switch(name){
		    case "Asghar":
		      out="Will take care of Java Assignment";
		      break;
		    case "Moazzam":
		      out="Will take care of SDLC";
		      break;
		    case "Weqas":
		      out="Will take care of Selenium Assignment";
		      break;
		    case "Asel":
		      out="Will take care of every Assignment";
		      break;
		    default:
		      out="Invalid instructor selected";
		  }

		  
		}
		
	}


