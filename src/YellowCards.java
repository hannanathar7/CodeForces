import java.util.*;
public class YellowCards {

	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int k1=sc.nextInt();
		int k2=sc.nextInt();
		int n=sc.nextInt();
		int min=0,max=0;
		int a=((k1-1)*a1)+((k2-1)*a2);
		int diff=a-n;
		if(diff>=0)
			min=0;
		else
		{
			int d1=(a1+a2)-(-1*diff);
			if(d1>=0)
				min=(-1*diff);
			else
				min=a1+a2;
		}
		if(k1<=k2)
		{
			int d2=n-(k1*a1);
			if(d2>=0)
			{
				max=a1;
				n=d2;
				int d3=n/k2;
				if(d3<=a2)
					max=max+d3;
				else
					max=max+a2;
			}
			else
			{
				max=n/k1;
			}
		}
		
		else
			{
				int d2=n-(k2*a2);
				if(d2>=0)
				{
					max=a2;
					n=d2;
					int d3=n/k1;
					if(d3<=a1)
						max=max+d3;
					else
						max=max+a1;
				}
				else
					max=n/k2;
			}
		System.out.println(min+" "+max);
		
		
		sc.close();
	}
}
