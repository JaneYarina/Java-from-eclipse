package com.syntax.class05;
import java.util.Scanner;
class Main {
      public static void main(String[] args) {
Scanner scan=new Scanner (System.in);
        char gender;
        int age;
       gender=scan.next().charAt(0);
  System.out.println("Please enter your gender:");
        age=scan.nextInt();
        System.out.println("Please enter your age");

        if(age>25) {
          if(gender=='F') {
          System.out.println("Woman");
        }else{
          System.out.println("Man");
        }
      }else{
       if(gender=='F'){
         System.out.println("Girl");
       } else{
         System.out.println("Boy");
       }
      }
         
        }
      

    }

	

