package MethodsPrograms;

import java.util.Scanner;

public class RecursionSumof10$3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(sum(10));
}
public static int sum(int n)
{
	if(n<=1)
	{
		return n;
	}
	else
	{
		return(n+sum(n-1));
	}
}
}
