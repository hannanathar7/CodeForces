import java.util.*;
public class GoodolNumbersColoring {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int gcd=gcd(a,b);
			if(gcd==1)
				System.out.println("Finite");
			else
				System.out.println("Infinite");
		}
		sc.close();
	}
	
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return (gcd(b,a%b));
	}
}
