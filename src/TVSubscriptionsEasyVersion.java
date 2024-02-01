import java.util.*;
public class TVSubscriptionsEasyVersion {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int d=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			if(n==d)
			{
			Set<Integer> set=new HashSet<Integer>();
			for(int i=0;i<n;i++)
				set.add(a[i]);
			System.out.println(set.size());
			continue;
			}
			ArrayList<Integer> list1=new ArrayList<Integer>();
			ArrayList<Integer> list2=new ArrayList<Integer>();
			int x=0;
			for(int i=0;i<=n-d;i++)
			{
				for(int j=i;j<n;j++)
				{
				if(!(list1.contains(a[j])))
				{
					list1.add(a[j]);
				}
				x++;
				if(x==d)
					break;
				}
				list2.add(list1.size());
				list1.clear();
				x=0;
			}
			Collections.sort(list2);
			System.out.println(list2.get(0));
		}
		sc.close();
	}
}
