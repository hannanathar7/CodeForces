import java.util.*;
public class CandiesDivision {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextLong();
			long k=sc.nextLong();
			long sum=0;
			long a=n/k;
			long rem=n%k;
			sum=sum+(a*k);
			long more=k/2;
			sum=sum+Math.min(more,rem);
			System.out.println(sum);
			
			
		}
		sc.close();
	}
}
