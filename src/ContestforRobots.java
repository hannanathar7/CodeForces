import java.util.*;
public class ContestforRobots {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		int score[]=new int[n];
		int e=0,sumb=0,suma=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==1 && b[i]==1)
			{
				
				score[i]=1;
			}
			else if(a[i]==0 && b[i]==1)
			{
				
				score[i]=1;
			}
			else if(a[i]==1 && b[i]==0)
			{
				e++;
			}
		}
		if(e==0)
			System.out.println("-1");
		else
		{
		for(int i=0;i<n;i++)
		{
			if(b[i]==1)
				sumb=sumb+score[i];
			if(a[i]==1)
				suma=suma+score[i];
		}
		int diff=sumb-suma+1;
		int max=(int)(Math.ceil(diff*1.0/e));
		System.out.println(max);	
		}
		sc.close();
	}
}
