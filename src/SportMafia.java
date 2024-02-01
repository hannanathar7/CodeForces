import java.util.*;
public class SportMafia {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		long sum=0;
		long i=1;
		long a=0;
		long del=0;
		while(a<n)
		{
			if(sum<=k)
			{
			sum=sum+i;
			i++;
			a++;
			}
			else
			{
				long diff=sum-k;
				sum=sum-diff;
				a=a+diff;
				del=del+diff;
			}
		}
		System.out.println(del);
		sc.close();
	}
}
