
public class Pattern3 {
	public static void main(String[] args) {
		int n=4;
		int ch=65;
		for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=4; j++) {
			if(i==1||j==1||i==4||j==4)
			{
			System.out.print((char)(ch)+" ");
			ch++;
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	}
}
