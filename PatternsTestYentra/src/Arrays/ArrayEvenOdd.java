package Arrays;

import java.util.Scanner;

public class ArrayEvenOdd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
	}
}
}
