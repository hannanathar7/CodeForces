import java.util.*;
public class SinglePush {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int flag=0;
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			int diff=0;
			ArrayList<Integer> list=new ArrayList<Integer>();
			ArrayList<Integer> list1=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				if(a[i]!=b[i])
				{
					diff=b[i]-a[i];
					if(diff<0)
					{
						flag=1;
						break;
					}
					else
					list.add(diff);
				}
			}
			if(flag==1)
			{
				System.out.println("NO");
				continue;
			}
		if(list.size()>1)
		{
			diff=list.get(0);
			for(int i=1;i<list.size();i++)
			{
				if(diff!=list.get(i))
				{
					flag=1;
					break;
				}
			}
		}
		else
		{
			System.out.println("YES");
			continue;
		}
		if(flag==1)
		{
			System.out.println("NO");
			continue;
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]!=b[i])
					list1.add(i);
			}
			
		}
		
		for(int i=0;i<list1.size()-1;i++)
		{
			if(list1.get(i+1)-list1.get(i)>1)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("NO");
		else
			System.out.println("YES");
		
		
		}
		sc.close();
	}
}
