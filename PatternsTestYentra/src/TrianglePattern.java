
public class TrianglePattern {
public static void main(String[] args) {
	//HERE I AM PRINT BASED ON COLUMNS
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	//HERE I AM PRINTING COLUMNS
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	System.out.println();//I AM PRINTING ROWS
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	System.out.println();//HERE I AM PRINTING COUNT INCREAMENT
	int count=1;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	}
	
	System.out.println();//HERE I AM PRINTNG ROWS
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			if(j%2==0)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print("1 ");
			}
		}
		System.out.println();
	}
	
	System.out.println();//I AM PRINTING HERE IF I%2==0 IS TRUE PRINT I OR VALUE=5;
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			else
			{
				System.out.print("5"+" ");
			}
		}
		System.out.println();
	}
}
}
