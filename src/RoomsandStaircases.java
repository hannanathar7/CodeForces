import java.util.*;
public class RoomsandStaircases {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			int idx1=s.indexOf("1");
			int idx2=s.lastIndexOf("1");
			if(idx2==-1)
			{
				System.out.println(n);
				continue;
			}
			if(idx2==n-1 || idx1==0)
			{
				System.out.println(n*2);
				continue;
			}
			if(idx1==idx2)
			{
				int diff=n-idx2;
				if(idx1+1>=diff)
				{
					System.out.println((idx1+1)*2);
					continue;
				}
				else
				{
					System.out.println((diff)*2);
					continue;
				}
			}
			int diff=n-idx1;
			if(diff>=idx2+1)
			{
				System.out.println((diff)*2);
				continue;
			}
			else
			{
				System.out.println((idx2+1)*2);
				continue;
			}
			
		}
		sc.close();
	}
}
