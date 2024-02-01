import java.util.*;
public class CharacterSwapEasyVersion {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			int c=0;
			Set<Character> set1=new HashSet<Character>();
			Set<Character> set2=new HashSet<Character>();
			for(int i=0;i<n;i++)
			{
				char ch1=s1.charAt(i);
				char ch2=s2.charAt(i);
				if(ch1!=ch2)
				{
					set1.add(ch1);
					set2.add(ch2);
					c++;
				}
			}
			if(c==0)
			{
				System.out.println("Yes");
				continue;
			}	
			if((c==1) || (c>2))
			{
				System.out.println("No");
				continue;
			}
			if((set1.size()==1) && (set2.size()==1))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
				
		}
		sc.close();
	}
}
