import java.util.*;
public class HappyBirthdayPolycarp {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextLong();
			String s="",s1="";
			s=s+n;
			long sum=0;
			int l=s.length();
			if(l==1)
			{
				System.out.println(n);
				continue;
			}
			for(int i=1;i<l;i++)
			{
				sum=sum+9;
			}
			long k=(int) Math.pow(10,l-1);
			long q=n/k;
			sum=sum+q-1;
			for(int i=1;i<=l;i++) 
				s1=s1+q;
			long n1=Long.parseLong(s1);
			if(n>=n1)
				sum++;
			System.out.println(sum);
			
			
		}
		sc.close();
	}
}
