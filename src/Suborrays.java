import java.util.*;
public class Suborrays {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=i+1;
		for(int i=n-1;i>=0;i--)
			System.out.print(a[i]+" ");
		System.out.println();
		}
		sc.close();
	}
}
