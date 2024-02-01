import java.util.*;
public class CubesSorting {
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
			int flag=0;
			for(int i=1;i<a.length;i++)
			{
				if(a[i-1]>a[i])
					continue;
				else
				{
					flag=1;
					break;
				}
				
			}
			
			if(flag==0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
