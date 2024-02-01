import java.util.*;
public class CircleofStudents {

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
			int flag=0;
			for(int i=0;i<n-1;i++)
			{
				int diff=Math.abs(a[i]-a[i+1]);
				if((diff!=1) && (diff!=n-1))
				{
					flag=1;
					break;
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
