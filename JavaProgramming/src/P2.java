
public class P2 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
		System.out.print("*"+" ");	
		}
		System.out.println();
	}
	
	System.out.println();//I AM GOING TO PRINT COLUMNS MEANS INNER LOOP
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	System.out.println();//I AM GOING TO PRINT ROWS MEANS OUTER LOOP
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	System.out.println();//I AM GOINING TO PRINT WHICH IS EVEN AND WHICH IS ODD BY COLUMN
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
			if(j%2==0)
			{
				System.out.print("0"+" ");
			}
			else
				System.out.print("1"+" ");	
		}
		System.out.println();
	}
	
	System.out.println();
	int count=1;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
			System.out.print(count+++" ");
		}
		System.out.println();
	}
}
}
