import java.util.*;
public class BuyingTorches {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long x=sc.nextLong();
			long y=sc.nextLong();
			long k=sc.nextLong();
			long op=k;;
			long req=y*k+k-1;
			long q=req/(x-1);
			long r=req%(x-1);
			op=op+q;
			if(r!=0)
				op++;
			System.out.println(op);
		}
		sc.close();
	}
}
