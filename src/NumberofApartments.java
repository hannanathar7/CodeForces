import java.util.*;
public class NumberofApartments {

	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a[]=new int[3];
			if(n==1 || n==2 || n==4)
			{
				System.out.println("-1");
				continue;
			}
			else if(n%3==0)
			{
				System.out.println(n/3+" "+0+" "+0);
				continue;
			}
			else if(n%5==0)
			{
				System.out.println(0+" "+n/5+" "+0);
				continue;
			}
			else if(n%7==0)
			{
				System.out.println(0+" "+0+" "+n/7);
				continue;
			}
			else if(((n-7)%5==0) || ((n-7)%3==0))
			{
				n=n-7;
				if (n%5==0)
				{
					System.out.println(0+" "+n/5+" "+1);
					continue;
				}
				
				if(n%3==0)
				{
					System.out.println(n/3+" "+0+" "+1);
					continue;
				}
			}
			
			else if(((n-5)%7==0) || ((n-5)%3==0))
			{
				n=n-5;
				if (n%7==0)
				{
					System.out.println(0+" "+1+" "+n/7);
					continue;
				}
				
				if(n%3==0)
				{
					System.out.println(n/3+" "+1+" "+0);
					continue;
				}
			}
			else if(((n-3)%5==0) || ((n-3)%7==0))
			{
				n=n-3;
				if (n%5==0)
				{
					System.out.println(1+" "+n/5+" "+0);
					continue;
				}
				
				if(n%7==0)
				{
					System.out.println(1+" "+0+" "+n/7);
					continue;
				}
			}
			else
			{
				System.out.println("-1");
				continue;
			}
		
		}
		sc.close();
	}
}
