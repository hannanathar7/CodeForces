import java.util.*;
public class CaptainFlintandCrewRecruitment {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			if(n<=30)
				System.out.println("NO");
			else
			{
				if(n==36)
				{
					System.out.println("YES");
					System.out.println(5+" "+6+" "+10+" "+15);
					System.out.println();
				}
				else if(n==40)
				{
					System.out.println("YES");
					System.out.println(5+" "+6+" "+14+" "+15);
					System.out.println();
				}
				else if(n==44)
				{
					System.out.println("YES");
					System.out.println(6+" "+10+" "+13+" "+15);
					System.out.println();
				}
				else
				{
					int rem=n-30;
					System.out.println("YES");
					System.out.println(6+" "+10+" "+14+" "+rem);
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
