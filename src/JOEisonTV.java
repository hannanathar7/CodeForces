import java.util.*;
public class JOEisonTV {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0.0;
		for(int i=n;i>=1;i--)
		{
			sum=sum+(1.0/i);
		}
		System.out.println(sum);
		sc.close();
	}
}
