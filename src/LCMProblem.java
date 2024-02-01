import java.util.*;
public class LCMProblem {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long l=sc.nextLong();
			long r=sc.nextLong();
			long x=-1,y=-1;
			if(2*l<=r)
			{
				x=l;
				y=2*l;
			}
			System.out.println(x+" "+y);
			
		}
		sc.close();
	}
	
	
}
