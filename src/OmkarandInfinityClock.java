import java.util.*;
public class OmkarandInfinityClock {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int res;
			long k=sc.nextLong();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			if(k%2==0)
				res=2;
			else
				res=1;
			for(int j=1;j<=res;j++)
			{
				long max=a[0];
			for(int i=1;i<n;i++)
			{
				if(a[i]>max)
					max=a[i];
			}
			for(int i=0;i<n;i++)
			{
				a[i]=max-a[i];
			}
			}
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
	


}
