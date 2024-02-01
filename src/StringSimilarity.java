import java.util.*;

public class StringSimilarity {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=1;k<=t;k++)
		{

			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			String res="",res1;
			int y=0;
			while(y!=n)
			{
				int beg=y;
				int end=n+y;
				res1=s.substring(beg,end);
				res=res+res1.charAt(y);
				y++;
			}
			System.out.println(res);
			
			
		}
	}
}
