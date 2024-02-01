import java.util.*;
public class SagesBirthdayeasyversion {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Long a[]=new Long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		int q=n/2;
		int r=n%2;
		if(r==0)
			System.out.println(q-1);
		else
			System.out.println(q);
		Long b[]=new Long[n];
		Arrays.sort(a,Collections.reverseOrder());
		int k=0;
		for(int i=0;i<n;i=i+2)
		{
			b[i]=a[k];
			k++;
		}
		for(int i=1;i<n;i=i+2)
		{
			b[i]=a[k];
			k++;
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		sc.close();
	}
}
