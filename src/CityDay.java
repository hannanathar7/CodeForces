import java.util.*;
public class CityDay {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		int res=-1;
		for(int i=0;i<n;i++)
		{
			int c=0,d=0,flag=0;
			for(int j=i-1;j>=0;j--)
			{
				if(c==x)
					break;
				if(a[j]<a[i])
				{
					flag=1;
					break;
				}
				c++;
			}
			
			for(int j=i+1;j<n;j++)
			{
				if(flag==1)
					break;
				if(d==y)
					break;
				if(a[j]<a[i])
				{
					flag=1;
					break;
				}
				d++;
			}
			if(flag==0)
			{
				res=i+1;
				break;
			}
				
			
		}
		System.out.println(res);
		sc.close();
	}
}
