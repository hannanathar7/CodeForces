import java.util.*;
public class DisplayTheNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			if(n%2==0)
			{
				for(int i=1;i<=n/2;i++)
					System.out.print("1");
				System.out.println();
			}
			else
			{
				System.out.print("7");
				for(int i=1;i<n/2;i++)
					System.out.print("1");
				System.out.println();
			}
		}
		sc.close();
	}
}
