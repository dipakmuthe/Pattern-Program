package NumberPattern;
import java.util.*;
public class TimerPatternNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ::");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
