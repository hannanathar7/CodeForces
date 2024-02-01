import java.util.*;
public class CaptainFlintandaLongVoyage {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int q=n/4;
			int r=n%4;
			if(r>0)
				q++;
			for(int i=0;i<(n-q);i++)
			a[i]=9;
			for(int i=(n-q);i<n;i++)
			a[i]=8;
			for(int i=0;i<n;i++)
			System.out.print(a[i]);
			System.out.println();
		}
		sc.close();
	}
}
