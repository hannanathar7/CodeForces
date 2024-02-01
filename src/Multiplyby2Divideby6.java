import java.util.Scanner;
public class Multiplyby2Divideby6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			long n=sc.nextLong();
			int sum=0;
			while(n>=1)
			{
				if(n%6==0)
				{
					n=n/6;
					sum++;
				}
				else if(n%3==0)
				{
					n=n*2;
					sum++;
				}
				else if(n==1)
					break;
				else
				{
					sum=-1;
					break;
				}
				
			}
			System.out.println(sum);
		}
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
