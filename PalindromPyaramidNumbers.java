package NumberPattern;
import java.util.*;
public class PalindromPyaramidNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit::");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
