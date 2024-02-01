import java.util.*;
public class CopyingHomework {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int diff=Math.abs(a[i]-n);
			b[i]=diff+1;
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		sc.close();
	}
}
