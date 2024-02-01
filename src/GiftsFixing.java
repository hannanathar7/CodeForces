import java.util.*;
public class GiftsFixing {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	
		for(int k=1;k<=t;k++)
		{
			long sum=0;
			int n=sc.nextInt();
			long a[]=new long[n];
			long b[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			long mina=minimum(a);
			long minb=minimum(b);
			for(int i=0;i<n;i++)
			{
				if(a[i]>mina && b[i]>minb)
				{
					long diff1=a[i]-mina;
					long diff2=b[i]-minb;
					sum=sum+Math.max(diff1, diff2);
				}
				else if(a[i]>mina && b[i]==minb)
				{
					long diff1=a[i]-mina;
					sum=sum+diff1;
				}
				else if(a[i]==mina && b[i]>minb)
				{
					long diff2=b[i]-minb;
					sum=sum+diff2;
				}
				
			}
			
			System.out.println(sum);
		}
		
	}
	
	
	public static long minimum(long a[])
	{
		long min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
}
