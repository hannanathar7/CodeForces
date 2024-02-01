import java.util.*;
public class JohnnyandAncientComputer {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a==b)
			{
				System.out.println("0");
				continue;
			}
			long min=Math.min(a,b);
			long max=Math.max(a, b);
			if(max%min!=0)
			{
				System.out.println("-1");
				continue;
			}
			long q=max/min;
			long sum=0;
			while(q%8==0)
			{
				q=q/8;
				sum++;
			}
			while(q%4==0)
			{
				q=q/4;
				sum++;
			}
			while(q%2==0)
			{
				q=q/2;
				sum++;
			}
			if(q!=1)
			{
				System.out.println("-1");
					
			}
			else
			System.out.println(sum);
		}
		
		
		sc.close();
	}
}
