import java.util.*;
public class Pillars {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int flag=0;
		int max=a[0];
		int maxi=0;
		
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				maxi=i;
			}
		}
		
		for(int i=0;i<maxi;i++)
		{
			if(a[i+1]-a[i]<0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("NO");
			sc.close();
			return;
		}
		
		for(int i=maxi;i<n-1;i++)
		{
			if(a[i]-a[i+1]<0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
			
		
		sc.close();
	}
}
