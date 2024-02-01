import java.util.*;
public class DominantPiranha {

	public static void main(String args []) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int flag=0;
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			long max=a[0];
			for(int i=1;i<n;i++)
			{
				if(a[i]>max)
					max=a[i];
			}
			if((a[0]==max) && (a[0]>a[1]))
			{
				System.out.println("1");
				continue;
			}
			if((a[n-1]==max) && (a[n-1]>a[n-2]))
			{
				System.out.println(n);
				continue;
			}
			for(int i=1;i<n-1;i++)
			{
			if((a[i]==max) && ((a[i]>a[i-1]) || (a[i]>a[i+1])))
			{
				flag=1;
				System.out.println(i+1);
				break;
			}
			}
			if(flag==0)
				System.out.println("-1");
		}
		sc.close();
	}
}
