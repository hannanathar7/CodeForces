
import java.util.*;
public class DistanceAndAxis {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int a=sc.nextInt();
			int k=sc.nextInt();
			for(int j=0;j<=100000;j++)
			{
				int diff2=(int)Math.abs(j-a);
				int diff3=(int)Math.abs(j-diff2);
				if(diff3==k)
				{
					System.out.println(diff2);
					break;
				}
			}
		}
		sc.close();
		
	}

}
