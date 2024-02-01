import java.util.*;
public class ShuffleHashing {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int t1=1;t1<=t;t1++)
		{
			String p=sc.nextLine();
			String h=sc.nextLine();
			int n=p.length();
			int m=h.length();
			char a[]=new char[n];
			char b[]=new char[n];
			int flag=0;
			for(int i=0;i<n;i++)
			a[i]=p.charAt(i);
			Arrays.sort(a);
			for(int i=0;i<m;i++)
			{
				for(int j=m-1;j>=i;j--)
				{
					
					String s=h.substring(i,j+1);
					
					if(s.length()==n)
					{
						for(int k=0;k<n;k++)
						b[k]=s.charAt(k);
						Arrays.sort(b);
							if(Arrays.equals(a,b))
							{
								flag=1;
								break;
							}
						
					}
				}
				if(flag==1)
					break;
			}
			if(flag==0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		sc.close();
	}
}
