package TwoDimentionalArray;

public class Identity2dArray {
public static void main(String[] args) {
	int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
	boolean rs=false;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]==a[i][j])
			{
				rs=true;
				break;
			}
			else
			{
				rs=false;
			}
			
		}
	}
	if(rs==true)
	{
		System.out.println("Identity ");
	}
	else
	{
		System.out.println("Not Identity ");
	}
	
					

}
}
