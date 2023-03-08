package NumberPrograms;

public class BuzzNumber {
public static void main(String[] args) {
	int n=7;
		if(n%10==7||n%7==0)
		{
			System.out.println("Buzz Number ");
		}
		else
		{
			System.out.println("Not a Buzz Number ");
		}
		n/=10;
}
}
