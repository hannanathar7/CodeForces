import java.util.*;
public class RoadtoZero {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long x=sc.nextLong();
			long y=sc.nextLong();
			long a=sc.nextLong();
			long b=sc.nextLong();
			long sum=0;
			long min=Math.min(x,y);
			long max=Math.max(x,y);
			while(min>0 && max>0)
			{
				if(2*a>=b)
				{
				sum=sum+min*b;
				max=max-min;
				min=0;
				
				}
				else if(2*a<b)
				{
					sum=sum+min*a;
					min=0;
					sum=sum+max*a;
					max=0;
				}
				
			}
			if(max>0)
			{
				sum=sum+max*a;
				max=0;
			}
			System.out.println(sum);
			
		}
		sc.close();
	}
}
