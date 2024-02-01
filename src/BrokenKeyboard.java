import java.util.*;
public class BrokenKeyboard {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int t1=1;t1<=t;t1++)
		{
			String s=sc.nextLine();
			ArrayList<Character> list=new ArrayList<Character>();
			int j;
			if(s.length()==1)
			{
				System.out.println(s);
				continue;
			}
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				int c=1;
				for(j=i+1;j<s.length();j++)
				{
					char ch1=s.charAt(j);
					if(ch!=ch1)
						break;
					else
						c++;
				}
				if((c%2!=0) && (!(list.contains(ch))))
				{
					list.add(ch);
					
				}
				i=j-1;
			}
			Collections.sort(list);
			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i));
			System.out.println();
		}
		sc.close();
	}
}
