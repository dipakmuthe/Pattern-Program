package Loops;

public class XShapeNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int n=10;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i==j || j==n-i)
				{
					System.out.print(a++ +" ");
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
