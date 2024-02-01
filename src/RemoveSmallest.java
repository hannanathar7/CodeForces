import java.util.*;
public class RemoveSmallest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int deleted=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int diff=(int)Math.abs(a[i]-a[j]);
					if(diff<=1)
					{
					
						deleted++;
						break;
					}
						
				}
			}
			if(n-deleted==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		} 
	}
 
}