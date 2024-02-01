import java.util.*;
public class SymmetricMatrix {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int flag=0;
			
			for(int i=1;i<=n;i++)
			{
				int r1=sc.nextInt();
				int c1=sc.nextInt();
				int r2=sc.nextInt();
				int c2=sc.nextInt();
				if((r2==c1) && (m%2==0))
				{
					flag=1;
				}	
			}
			if(flag==1)
			System.out.println("YES");
			
			else if(flag==0)
				System.out.println("NO");
			}
		
		sc.close();
	}
}
