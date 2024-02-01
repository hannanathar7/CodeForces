import java.util.*;
public class BoboniuLikestoColorBalls {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long r=sc.nextLong();
			long g=sc.nextLong();
			long b=sc.nextLong();
			long w=sc.nextLong();
			int sum=0;
			if(r%2==1)
				sum++;
			if(g%2==1)
				sum++;
			if(b%2==1)
				sum++;
			if(w%2==1)
				sum++;
			if(sum==1 || sum==0)
			{
				System.out.println("Yes");
				continue;
			}
			if(r>0 && g>0 && b>0)
			{
			r--;
			
			g--;
			
			b--;
			w=w+3;
			}
			sum=0;
			if(r%2==1)
				sum++;
			if(g%2==1)
				sum++;
			if(b%2==1)
				sum++;
			if(w%2==1)
				sum++;
			if(sum==1 || sum==0)
				System.out.println("Yes");
			else
				System.out.println("No");
				
		}
		sc.close();
	}
}
