package Halogram;

import java.util.Scanner;

public class LeftSideFullpirimid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				if(j<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		
		for (int i = n-1; i >=1; i--) {
			for (int j = 1; j <=2*i-1; j++) {
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("");
				}
			}
			
			System.out.println();
		}
		
		
	}
}
