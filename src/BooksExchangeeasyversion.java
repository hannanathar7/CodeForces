import java.util.*;
public class BooksExchangeeasyversion {

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
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
				int c=1,j=i;
				while(a[j]!=i+1)
				{
					j=a[j]-1;
					c++;
				}
				b[i]=c;
			}
			for(int i=0;i<n;i++)
				System.out.print(b[i]+" ");
			System.out.println();
		}
		sc.close();
	}
}
