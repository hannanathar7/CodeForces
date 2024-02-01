import java.util.*;
public class MagicStick {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long prev=0;
			while(a<b)
			{
				if(a%2==0)
				a=(long)(1.5*a);
				
				else if(a>1 && a!=prev)
				{
					a=a-1;
					prev=a+1;
				}
				
				else if(a==prev || a<=1)
					break;
			}
			if(a>=b)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
