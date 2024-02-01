import java.util.*;
public class NumberofApartments1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		{
			for(int t1=1;t1<=t;t1++)
			{
				int n=sc.nextInt();
				int flag=0;
				for(int x=0;x<=n/3;x++)
				{
					for(int y=0;y<=n/5;y++)
					{
						for(int z=0;z<=n/7;z++)
						{
							int sum=(3*x)+(5*y)+(7*z);
							if(sum==n)
							{
								System.out.println((x)+" "+(y)+" "+(z));
								flag=1;
								break;
							}
						}
						if(flag==1)
							break;
					}
					if(flag==1)
						break;
				}
				if(flag==0)
					System.out.println("-1");
			}
		}
		sc.close();
	}
}
