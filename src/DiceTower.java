import java.util.*;
public class DiceTower {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextLong();
			long q=n/14;
			if(q<1)
			{
				System.out.println("NO");
				continue;
			}
			long r=n%14;
			if(r>=1 && r<=6)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
