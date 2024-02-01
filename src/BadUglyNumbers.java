import java.util.*;
public class BadUglyNumbers {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("-1");
				continue;
			}
			int a[]=new int[n];
			a[0]=2;
			for(int i=1;i<n;i++)
				a[i]=3;
			for(int i=0;i<n;i++)
			System.out.print(a[i]);
			System.out.println();
		}
		sc.close();
	}
}
