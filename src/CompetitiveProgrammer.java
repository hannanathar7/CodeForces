import java.util.*;
public class CompetitiveProgrammer {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int t1=1;t1<=t;t1++)
		{
			String s=sc.nextLine();
			int sum=sod(s);
			if(sum==0)
			{
				System.out.println("red");
				continue;
			}
			if(sum%3!=0)
			{
				System.out.println("cyan");
				continue;
			}
			int res=even(s);
			if(res==0)
			{
				System.out.println("cyan");
				continue;
			}
			if(s.contains("0") && res==1)
			{
				System.out.println("red");
				
			}
			else
				System.out.println("cyan");
			
		}
		sc.close();
	}
	
	public static int sod(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			sum=sum+Integer.parseInt(String.valueOf(ch));
		}
		return sum;
	}
	
	public static int even(String s)
	{
		int sum=0,res=0;
		for(int i=0;i<s.length();i++)
		{
			int a=Integer.parseInt(String.valueOf(s.charAt(i)));
			if(a%2==0)
				sum++;
			if(sum>=2)
			{
				res=1;
				break;
			}
		}
		return res;
	}
	
	
}
