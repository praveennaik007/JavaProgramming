import java.util.Scanner;

public class XylemOrPholem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int x=0; int y=0;
	int x1=n%10;
	x+=x1;
	n/=10;
	while(n>9)
	{
		int d=n%10;
		y+=d;
		n/=10;
	}
	x+=n;
	if(x==y)
	{
		System.out.println("xylem");
	}
	else
	{
		System.out.println("pholem");
	}
	
}
}
