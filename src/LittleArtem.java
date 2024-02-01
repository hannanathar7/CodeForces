import java.util.*;
public class LittleArtem {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			char a[][]=new char[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if((i==n-1) &&(j==m-1))
					{
						a[i][j]='W';
					}
					else
						a[i][j]='B';
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
