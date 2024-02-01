import java.util.*;
public class MariaBreakstheSelfisolation {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			if(a[n-1]<=n)
			{
				System.out.println(n+1);
				continue;
			}
			int sum=1;
			int no=1;
			for(int i=0;i<n;i++)
			{
				if(a[i]<=no)
				{
					sum=i+2;
					
				}
				no=i+2;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
