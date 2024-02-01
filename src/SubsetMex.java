import java.util.*;
public class SubsetMex {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int sum=0;
			int freq[]=new int[101];
			for(int i=0;i<n;i++)
			{
				freq[a[i]]=freq[a[i]]+1;
			}
			for(int i=0;i<101;i++)
			{
			if(freq[i]==0)
			{
				sum=sum+i;
				break;
			}
			else
			{
				freq[i]=freq[i]-1;
			}
			}
			for(int i=0;i<101;i++)
			{
			if(freq[i]==0)
			{
				sum=sum+i;
				break;
			}
			else
			{
				freq[i]=freq[i]-1;
			}
			}
			System.out.println(sum);
	
			
		}
		sc.close();
	}

}
