import java.util.Scanner;

public class SunnyNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int sq=n+1;
	boolean rs=false;
	for (int i = 1; i <=sq/2; i++) {
		if(i*i==sq)
		{
			
			rs=true;
			break;
		}
	}
	if(rs==true)
	{
		System.out.println("sunny number ");
	}
	else
	{
		System.out.println("not Sunny");
	}
	
	
}
}
