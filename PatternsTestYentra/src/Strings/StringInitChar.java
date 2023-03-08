package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringInitChar {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String s1="";
//	String str[]=s.split("");
//	System.out.println(Arrays.toString(str));
//	for (int i = 0; i < str.length; i++) {
//		char ch=s.charAt(i);
//		if(i==0||s.charAt(i-1)==' ')
//		{
//			s1+=str[i].toUpperCase();
//		}
//		else
//		{
//			s1+=str[i].toLowerCase();
//		}
//	}
//	System.out.println(s1);
	char ch1[]=s.toCharArray();
	for (int i = 0; i < ch1.length; i++) {
		if(i==0||ch1[i-1]==' ')
		{
			s1+=(char)(ch1[i]-32);
		}
		else
		{
			s1+=ch1[i];
		}
	}

	
}
}
