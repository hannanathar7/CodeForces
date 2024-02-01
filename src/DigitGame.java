import java.util.*;
public class DigitGame {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			int res;
			if(n%2==1)
			{
				res=2;
				for(int i=0;i<s.length();i=i+2)
				{
					int a=Character.getNumericValue(s.charAt(i));
					if(a%2==1)
					{
						res=1;
						break;
					}
				}
			}
			else
			{
				res=1;
				for(int i=1;i<s.length();i=i+2)
				{
					int a=Character.getNumericValue(s.charAt(i));
					if(a%2==0)
					{
						res=2;
						break;
					}
				}
			}
				System.out.println(res);
			}
		
		sc.close();
	}
}
