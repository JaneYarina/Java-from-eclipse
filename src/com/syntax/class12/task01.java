package com.syntax.class12;

public class task01 {

	public static void main(String[] args) {
		//String userName="admin";//if user name and passwords are empty 
		//String password="pass123";//if not empty password 8 caracter long
		//String confirmPassword="pass123";//username dose not contain the password
		 //password and confirmed password are the same
		
		String userName="admin";
		String password="Passwor";
		String confirmPassword="Passwor";
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			
		}else if(password.length()<8) {
				System.out.println("Password is too short");
		}else if(password.contains(userName)) {	
			System.out.println("Password cannot contain username");
		}else if (!password.equals(confirmPassword)) {
			System.out.println("Password do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
				
			}
		

	}


