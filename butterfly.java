package Loops;

public class butterfly {

	public static void main(String[] args) {
		// Butterfly Pattern
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
