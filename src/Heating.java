import java.util.*;
public class Heating {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int c=sc.nextInt();
			int sum=sc.nextInt();
			long res=0;
			if(c>=sum)
			{
				System.out.println(sum);
				continue;
			}
			if(c==1)
			{
				System.out.println(sum*sum);
				continue;
			}
			int q=sum/c;
			int r=sum%c;
			res=res+(c-r)*q*q;
			res=res+r*(q+1)*(q+1);
			System.out.println(res);
		}
		sc.close();
	}
}