package Strings;

import java.util.Scanner;

public class City {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		System.out.println(s.substring(s.length()-4));
	}
}
