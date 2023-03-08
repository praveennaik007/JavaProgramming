package Arrays;

import java.util.Scanner;

public class ArrayMergeTwoArrays {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Enter the size1");
	int x=sc.nextInt();
	int b[]=new int[x];
	for (int i = 0; i < b.length; i++) {
		b[i]=sc.nextInt();
	}
	
	int c[]=new int[a.length+b.length];
	
	for (int i = 0; i < a.length; i++) {
		if(c[i]<=a[i])
		{
			c[i]=a[i];
		}
	}
	
	for (int i = 0; i < b.length; i++) {
		if(c[i]<=b[i])
		{
			c[i+a.length]=b[i];	
		}
	}
	
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
	
	System.out.println();
	
//	int a1[]={5,4,6,7};
//	int a2[]= {8,9,4,3};
//	
//	int a3[]=new int[a1.length+a2.length];
//	int k=0;
//	for (int i = 0; i < a3.length; i++) {
//		if(i<=a1.length)
//		{
//			a3[i]=a1[i];
//		}
//		else
//		{
//			a3[i]=a2[k];
//			k++;
//		}
//	}
//	System.out.println(a3);
	
}
}
