
public class p3 {
public static void main(String[] args) {
	char ch='Z';
	for (int i = 1; i <=4; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print(ch);
		ch--;
	}
	
	System.out.println();
	}
	
	System.out.println();
	
	char ch1='Z';
	for (int i = 1; i <=4; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print(ch1);	
	}
	ch1--;
	System.out.println();
	}
	
	System.out.println();
	
	for (int i = 1; i <=4; i++) {
		char ch2='Z';
	for (int j = 1; j <=i; j++) {
		System.out.print(ch2);
		ch2--;
	}
	
	System.out.println();
	}
}
}
