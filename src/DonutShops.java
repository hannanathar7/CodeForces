import java.util.*;
public class DonutShops {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long c=sc.nextLong();
			long s1,s2;
			if(a>=c)
				s1=-1;
			else
				s1=1;
			if(c/b>=a)
				s2=-1;
			else
				s2=b;
			System.out.println(s1+" "+s2);
			
		}
		sc.close();
	}
}
