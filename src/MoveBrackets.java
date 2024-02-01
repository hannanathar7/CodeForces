import java.util.*;
public class MoveBrackets {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			int c=0;
			ArrayList<Integer> list1=new ArrayList<Integer>();
			ArrayList<Integer> list2=new ArrayList<Integer>();
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='(')
				{
					list1.add(i);
				}
			}
		
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch==')')
				{
					list2.add(i);
				}
			}
			for(int i=0;i<list1.size();i++)
			{
				
				for(int j=0;j<list2.size();j++)
				{
					int idx1=list1.get(i);
					int idx2=list2.get(j);
					if(idx1<idx2)
					{
						list2.remove(j);
						list1.remove(i);
						c++;
						j=-1;
						
					}
				}
			}
			System.out.println(n/2-c);
			
		}
		sc.close();
	}
}
