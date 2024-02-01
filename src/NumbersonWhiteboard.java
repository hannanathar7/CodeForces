import java.util.*;
public class NumbersonWhiteboard {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			System.out.println("2");
			int a=n,b=n-1;
			for(int i=1;i<n;i++)
			{
			System.out.println(a+" "+b);
			a=(a+b+1)/2;
			b--;
			}
			
		}
		sc.close();
	}
}
