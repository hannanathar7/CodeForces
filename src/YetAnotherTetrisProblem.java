import java.util.*;
public class YetAnotherTetrisProblem {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int max=a[0];
			int flag=0;
			for(int i=1;i<n;i++)
			{
				if(a[i]>max)
					max=a[i];
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]<max)
				{
					int diff=max-a[i];
					if(diff%2!=0)
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
