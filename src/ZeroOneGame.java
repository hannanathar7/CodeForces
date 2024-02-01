import java.util.*;
public class ZeroOneGame {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int t1=1;t1<=t;t1++)
		{
			String s=sc.nextLine();
			ArrayList<Integer> list=new ArrayList<Integer>();
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				int a=Character.getNumericValue(s.charAt(i));
				list.add(a);
			}
			for(int i=0;i<list.size()-1;i++)
			{
				int a=list.get(i);
				int b=list.get(i+1);
				if(a==b)
					continue;
				else
				{
				list.remove(i);
				list.remove(i);
				i=-1;
				sum++;
				}
			}
			if(sum%2==0)
				System.out.println("NET");
			else
				System.out.println("DA");
			}
		sc.close();
		}
		
	}


