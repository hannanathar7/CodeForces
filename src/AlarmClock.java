import java.util.*;
public class AlarmClock {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		long sum=b;
		if(d>=c && b<a)
		sum=-1;
		else if(d>=c && b>=a)
			sum=b;
		else if(b>=a)
			sum=b;
		else
		{	
			long rem=a-b;
			long req=(long)Math.ceil((rem*1.0)/(c-d));
			sum=sum+req*c;
		}
		
		System.out.println(sum);
		}
	}
}
