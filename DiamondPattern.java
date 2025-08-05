package StarPattern;
import java.util.*;
public class DiamondPattern {

	public static void main(String[] args)  
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Limit  ::");
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n-i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int k=1;k<=i*2-1;k++)
			 {
				 System.out.print(" *");
			 }
			 System.out.println();
		 }
		 for(int i=n-1;i>=1;i--)
		 {
			 for(int j=n;j>i;j--)
			 {
				 System.out.print("  ");
			 }
			 for(int k=1;k<=i*2-1;k++)
			 {
				 System.out.print(" *");
			 }
			 System.out.println();
		 }
		 
	}

}

