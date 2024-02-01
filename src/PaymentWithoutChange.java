import java.util.*;
public class PaymentWithoutChange {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long n=sc.nextLong();
			long s=sc.nextLong();
			long sum=0;
			long q=s/n;
			if(a>=q)
			{
				if(s>=q*n && s<=q*n+b)
				{
					System.out.println("YES");
				}
				else
					System.out.println("NO");
			}
			else
			{
			sum=a*n;
			if(s>=sum && s<=sum+b)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}
