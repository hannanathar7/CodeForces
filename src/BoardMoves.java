import java.util.*;
public class BoardMoves {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			long q=n/2;
			long sum=0;
			for(long i=1;i<=q;i++)
			{
				sum=sum+8*i*i;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
