import java.util.*;
public class NumbersBox {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
		for(int t=1;t<=t1;t++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			
			
			int no=0,neg=0,sum=0;
			no=m*n;
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i][j]<=0)
						neg++;
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i][j]<0)
					a[i][j]=a[i][j]*(-1);
				}
			}
			
			int min=a[0][0];
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					sum=sum+a[i][j];
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i][j]<min)
						min=a[i][j];
				}
			}
			
			if((no%2==0) && (neg%2==0))
				System.out.println(sum);
			else if((no%2==0) && (neg%2!=0))
				System.out.println(sum-(2*min));
			else if((no%2!=0) && (neg%2!=0))
				System.out.println(sum-(2*min));
			else if((no%2!=0) && (neg%2==0))
				System.out.println(sum);
			
			
			 
		}
		sc.close();
	}
}
