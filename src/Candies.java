import java.util.*;
public class Candies {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextInt();
			for(int k=2;k<=35;k++)
			{
				int a=(int)(Math.pow(2,k)-1);
				if(n%a==0)
				{
					System.out.println(n/a);
					break;
				}	
			}
		}
	}

}
