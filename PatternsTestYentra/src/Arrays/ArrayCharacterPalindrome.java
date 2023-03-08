package Arrays;

import java.util.Scanner;

public class ArrayCharacterPalindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
//	int n=sc.nextInt();
//	int a[]=new int[n];
//	for (int i = 0; i < a.length; i++) {
//		a[i]=sc.nextInt();
//	}
	char a[]={'a','d','a'};
	char b[]=new char[a.length];
	int temp=0;
	for (int i = a.length-1; i>=0; i--) 
	{
		b[temp++]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	
	}
	boolean rs=false;
	for (int j = 0; j < a.length; j++) {		
	if(b[j]==a[j])
	{
		rs=true;
		
	}
	else
	{
		rs=false;
	
	}
	if(rs==true)
	{
		System.out.println("Palindrome character");
	}
	else
	{
		System.out.println("not palindrome character ");
	}
	}
	
}
}
 