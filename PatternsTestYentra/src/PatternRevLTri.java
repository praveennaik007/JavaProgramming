import java.util.Scanner;

public class PatternRevLTri {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	for (int i = n; i>=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	int b=sc.nextInt();
	for (int i = b; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j+"");
		}
		System.out.println();
	}
	
	
System.out.println();
	
	int c=sc.nextInt();
	for (int i = c; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(i+"");
		}
		System.out.println();
	}
	
System.out.println();
	
	int d=sc.nextInt();
	int x=1;
	for (int i = d; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(x+"");	
		}
		x++;
		System.out.println();
	}
}
}
