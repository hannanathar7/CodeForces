import java.util.*;
public class BallsofSteel {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			int sum=0;
			int a[][]=new int[n][2];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<2;j++)
					a[i][j]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j)
						continue;
					double d=Math.abs(a[i][0]-a[j][0])+Math.abs(a[i][1]-a[j][1]);
					if(d>k*1.0)
					{
						sum++;
						break;
					}
					
				}
			}
			if(sum==n)
				System.out.println("-1");
			else
				System.out.println("1");
			
		}
		sc.close();
	}
}
