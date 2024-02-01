import java.util.*;
public class RainbowDashFluttershyandChessColoring {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextLong();
			long res=0;
			if(n==1)
				System.out.println(1);
			else
			{
			if(n>=4)
			res=(n/2)-1;
			res=res+2;
			System.out.println(res);
			}
		}
	}
}
