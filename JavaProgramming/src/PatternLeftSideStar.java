import java.util.Scanner;

public class PatternLeftSideStar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value ");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		for (int j = 1; j <i; j++) {
			System.out.print("  ");
		}
		for (int j = 1; j <=a+1-i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
