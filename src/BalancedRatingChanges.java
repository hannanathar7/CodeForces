import java.util.*;
public class BalancedRatingChanges {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int c=1,d=1;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				a[i]=a[i]/2;
			
			else if(a[i]%2==-1)
			{
				if(c%2==1)
				{
					a[i]=(int)Math.ceil(a[i]*1.0/2);
					c++;
					
				}
					
				else
				{
					a[i]=(int)Math.floor(a[i]*1.0/2);
					c++;
					
				}
			}
			
			else if(a[i]%2==1)
			{
				if(d%2==1)
				{
					a[i]=(int)Math.floor(a[i]*1.0/2);
					d++;
				}
				else
				{
					a[i]=(int)Math.ceil(a[i]*1.0/2);
					d++;
				}
			}
			
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		sc.close();
	}
}
