import java.util.*;
public class Bogosort {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			Integer a[]=new Integer[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a,Collections.reverseOrder());
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
		sc.close();
	}
}
