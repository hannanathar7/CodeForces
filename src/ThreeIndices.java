import java.util.*;
public class ThreeIndices {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int i;
			int flag=0;
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(i=1;i<n-1;i++)
			{
				if((a[i]>a[i-1]) && a[i]>a[i+1])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("YES");
				System.out.println(i+" "+(i+1)+" "+(i+2));
			}
			else
			System.out.println("NO");
	}

}
}
