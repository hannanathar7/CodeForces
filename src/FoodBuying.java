import java.util.*;
public class FoodBuying {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		{
			for(int t1=1;t1<=t;t1++)
			{
				long s=sc.nextLong();
				long sum=s;
				while(s>9)
				{
					long q=s/10;
					long r=s%10;
					s=q+r;
					sum=sum+q;
				}
				System.out.println(sum);
				
			}
			sc.close();
		}
	}
}
