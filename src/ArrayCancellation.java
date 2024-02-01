import java.util.*;
public class ArrayCancellation {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			long sum=0;
			int idx1=0;
			for(int i=0;i<n-1;i++)
			{
				if(a[i]>0)
				{
				a[i+1]=a[i+1]+a[i];
				a[i]=0;
				}
									
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]>0)
				{
					sum=sum+a[i];
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
