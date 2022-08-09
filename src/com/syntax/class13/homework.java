package com.syntax.class13;

public class homework {

	public static void main(String[] args) {
		// homework
String string="Batch 13 is great but i say this to every batch. I was kidding";

//int sentence=string.length();//? all length need to be upper case
//System.out.println(string.toUpperCase());//ALL UPPER CASE

string=string.toUpperCase();//?all length need to be upper case
System.out.println(string);

string=" ";
System.out.println(string.isEmpty());

String str2="Tara          ";
System.out.println(str2.trim());
string="batch 13 is great";
System.out.println(string.contains("b"));
System.out.println(string.startsWith("batch"));
System.out.println(string.endsWith("at"));
	}

}
