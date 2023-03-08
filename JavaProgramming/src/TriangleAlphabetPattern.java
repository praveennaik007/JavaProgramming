
public class TriangleAlphabetPattern {
public static void main(String[] args) {
	char ch='A';
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(ch);
		}
		ch++;
		System.out.println();
	}
	
	
	
	for (int i = 1; i <=5; i++) {
		char ch1='A';
		for (int j = 1; j <=i; j++) {
			System.out.print(ch1);
			ch1++;
		}
		System.out.println();
	}
	
	char ch2='A';
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(ch2);
			ch2++;
		}
		System.out.println();
	}
	
	System.out.println();
	int a=100;
	int b=500;
	int c=700;
	int d=400;
	int f=a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d;
	System.out.println(f);
}
}
