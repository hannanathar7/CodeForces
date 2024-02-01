import java.util.*;
public class OracandFactors {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextInt();
			long k=sc.nextLong();
			long div=fact(n);
			n=n+div;
			n=n+2*(k-1);
			System.out.println(n);
			}
		sc.close();
		}
		
	
	
	public static long fact(long n)
	{
		if(n%2==0)
			return 2;
		else
		{
			for(long i=3;i*i<=n;i=i+2)
			{
			if(n%i==0)
				return i;
			}
			return n;
		}
	}

}
