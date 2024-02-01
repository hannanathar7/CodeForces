import java.util.*;
public class StringsEqualization {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int t1=1;t1<=t;t1++)
		{
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			int flag=0;
			for(int i=0;i<s1.length();i++)
			{
				char ch1=s1.charAt(i);
				for(int j=0;j<s2.length();j++)
				{
					char ch2=s2.charAt(j);
					if(ch1==ch2)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
					break;
			}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
