package NumberPrograms;

public class DuckNumber {
public static void main(String[] args) {
	int n=1108;
	int count=0;
	while(n!=0)
	{
		int d=n%10;
		if(d==0)
		{
		count++;	
		}
		n/=10;
		
	}
	if(count>0)
	{
		System.out.println("Duck Number ");
	}
	else
	{
		System.out.println("Not a Duck Number ");
	}
}
}
