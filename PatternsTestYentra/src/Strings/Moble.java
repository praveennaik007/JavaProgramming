package Strings;

import java.util.Scanner;

public class Moble {
	public static void main(String[] args) {
		
	
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
String s=sc.next();
System.out.println(s.substring(0,4).concat("******"));
System.out.println(s.substring(0,4)+"******");
	}
}
