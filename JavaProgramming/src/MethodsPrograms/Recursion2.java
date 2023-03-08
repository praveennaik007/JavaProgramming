package MethodsPrograms;

import java.util.Scanner;

public class Recursion2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	recur(n);
}

public static void  recur(int x)
{
	if(x<=1)
	{
		return;
	}
	else
	{
		System.out.println("Happy Birthday");
		recur(x-1);
	}
}
}
