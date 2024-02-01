import java.util.*;
public class BerlandPoker {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			int q=n/k;
			if(m==0)
			{
				System.out.println("0");
				continue;
			}
			if(q>=m)
			{
				System.out.println(m);
				continue;
			}
			if(n==k)
			{
				System.out.println("0");
				continue;
			}
			
			if(m>q)
			{
				m=m-q;
				k=k-1;
				int res=(int)Math.ceil(m/(k*1.0));
				System.out.println(q-res);
				
				continue;
			}
			
			
			
		}
		sc.close();
	}
}
