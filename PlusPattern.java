package Loops;

public class PlusPattern{
//plus sign pattern using stars.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		int a=n/2;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++ )
			{
				if(j==a || i==a )
				{
					System.out.print("* ");
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
