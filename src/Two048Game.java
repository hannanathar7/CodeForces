import java.util.*;
public class Two048Game {

	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			int flag=0;
			long sum=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]==2048)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("YES");
				continue;
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]<=2048)
				sum=sum+a[i];
			}
			if(sum>=2048)
				System.out.println("YES");
			else
				System.out.println("NO");
				
		}
		sc.close();
	}
}
