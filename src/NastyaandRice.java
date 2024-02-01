import java.util.*;
public class NastyaandRice {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int d1=(a-b)*n;
			int d2=(a+b)*n;
			int d3=c-d;
			int d4=c+d;
			if ((d1 < d3 && d2 < d3) || (d1 > d4 && d2 > d4))
					System.out.println("No");
			else
				System.out.println("Yes");
			
			
		}
	}
}
