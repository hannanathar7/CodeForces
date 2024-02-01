import java.util.*;
public class IntegerPoints {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int m=sc.nextInt();
			long a[]=new long[m];
			for(int i=0;i<m;i++)
				a[i]=sc.nextLong();
			int n=sc.nextInt();
			long b[]=new long[n];
			for(int i=0;i<n;i++)
				b[i]=sc.nextLong();
			long res=0;
			long ae=0,ao=0,be=0,bo=0;
			for(int i=0;i<m;i++)
			{
				if(a[i]%2==0)
					ae++;
				else
					ao++;
			}
			
			for(int i=0;i<n;i++)
			{
				if(b[i]%2==0)
					be++;
				else
					bo++;
			}
			
			res=((ae*be)+(ao*bo));
			System.out.println(res);
		}
		sc.close();
	}
}
