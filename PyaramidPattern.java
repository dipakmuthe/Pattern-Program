package StarPattern;
import java.util.*;
public class PyaramidPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ::");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
