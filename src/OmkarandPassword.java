import java.util.*;
public class OmkarandPassword {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
		Set<Long> set=new HashSet<Long>();
		for(int i=0;i<n;i++)
			set.add(a[i]);
		if(set.size()>1)
			System.out.println(1);
		else
			System.out.println(n);
		}
	}
}
