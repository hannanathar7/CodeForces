import java.util.*;
public class AvoidingZero {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int sum=0,asum=0,dsum=0,flag=0;
			Integer a[]=new Integer[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				sum=sum+a[i];
			}
			if(sum==0)
				System.out.println("NO");
			else
			{
				
			Arrays.sort(a);
				for(int i=0;i<n;i++)
				{
					asum=asum+a[i];
					if(asum==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					Arrays.sort(a,Collections.reverseOrder());
					for(int i=0;i<n;i++)
					{
						dsum=dsum+a[i];
						if(dsum==0)
						{
							flag=2;
							 break;
						}
					}
					
				}
				if(flag==0)
				{
					Arrays.sort(a);
					System.out.println("YES");
					for(int i=0;i<n;i++)
						System.out.print(a[i]+" ");
					System.out.println();
				}
				if(flag==1)
				{
					Arrays.sort(a,Collections.reverseOrder());
					System.out.println("YES");
					for(int i=0;i<n;i++)
						System.out.print(a[i]+" ");
					System.out.println();
				}
					
			}
			
			
		}
		sc.close();
	}

}
