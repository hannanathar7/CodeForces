import java.util.*;
public class ValeriiAgainstEveryone {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int flag=0;
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			HashMap<Long,Integer> map=new HashMap<Long,Integer>();
			for(int i=0;i<n;i++)
			{
				if(map.containsKey(a[i]))
				{
					int v=map.get(a[i]);
					map.put(a[i],v+1);
				}
				else
					map.put(a[i],1);
			}
			for(Long l:map.keySet())
			{
				int v=map.get(l);
				if(v>1)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
