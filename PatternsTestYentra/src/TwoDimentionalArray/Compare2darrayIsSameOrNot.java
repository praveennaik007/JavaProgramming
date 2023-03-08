package TwoDimentionalArray;

public class Compare2darrayIsSameOrNot {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,1}};
	int b[][]= {{3,4,2},{6,8,5}};
	boolean rs=false;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a[i].length; j++) {
			if(a[i][j]==b[i][j])
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
		System.out.println("Same ");
	}
	else
	{
		System.out.println("Not");
	}
}
}
