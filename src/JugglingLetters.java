import java.util.*;
public class JugglingLetters {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int flag=0;
			String s1="";
			sc.nextLine();
			String s[]=new String[n];
			for(int i=0;i<n;i++)
				s[i]=sc.nextLine();
			for(int i=0;i<n;i++)
				s1=s1+s[i];
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(map.containsKey(ch))
				{
					int v=map.get(ch);
					map.put(ch, v+1);
				}
				else
					map.put(ch, 1);
			}
			for(Character ch:map.keySet())
			{
				int v=map.get(ch);
				if(v%n!=0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}
	}
}
