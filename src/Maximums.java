import java.util.*;
public class Maximums {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long b[]=new long[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextLong();
		long x[]=new long[n];
		long a[]=new long[n];
		x[0]=0;
		a[0]=b[0]+x[0];
		for(int i=1;i<n;i++)
		{
			x[i]=a[i-1];
			if(x[i]<x[i-1])
				x[i]=x[i-1];
			a[i]=b[i]+x[i];
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
