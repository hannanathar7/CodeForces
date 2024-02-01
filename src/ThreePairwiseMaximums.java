import java.util.*;
public class ThreePairwiseMaximums {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long x=sc.nextLong();
			long y=sc.nextLong();
			long z=sc.nextLong();
			long a,b,c;
			if(x==y)
			{
				a=x;
				b=z;
				c=Math.min(a,b);
				if(z>x)
					System.out.println("NO");
				else
				{
					System.out.println("YES");
					System.out.print(a+" "+b+" "+c);
					System.out.println();
				}
			}
			else
			{
				b=x;
				c=y;
				a=Math.min(b,c);
				if(z!=Math.max(b,c))
					System.out.println("NO");
				else
				{
					System.out.println("YES");
					System.out.print(a+" "+b+" "+c);
					System.out.println();
				}
			}
			
			
		}
		sc.close();
	}

}
