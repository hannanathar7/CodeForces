import java.util.*;
public class DreamoonandRankingCollection {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			SortedSet<Integer> set =new TreeSet<Integer>();
			for(int i=0;i<n;i++)
				set.add(a[i]);
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(Integer z : set)
			{
				list.add(z);
			}
			int res=0;
			for(int i=n+x;i>=1;i--)
			{
				int no=0;
				for(int j=1;j<=i;j++)
				{
					if(!(list.contains(j)))
						no++;
				}
				if(no<=x)
				{
					res=i;
					break;
				}
			}
			System.out.println(res);
			
			
		}
		sc.close();
	}
}
