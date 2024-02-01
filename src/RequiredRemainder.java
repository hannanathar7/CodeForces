import java.util.*;
public class RequiredRemainder {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
			int i=0;
			for(i=n;i>=0;i--)
			{
				if(i%x==y)
					break;
			}
			System.out.println(i);
		}
		sc.close();
	}

}
