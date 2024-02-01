import java.util.*;
public class FixYou {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int idxr=0,idxc=0,sum=0; 
			int r=sc.nextInt();
			int c=sc.nextInt();
			sc.nextLine();
			String s[]=new String[r];
			for(int i=0;i<r;i++)
			s[i]=sc.nextLine();
			for(int i=0;i<r;i++)
			{
				if(s[i].indexOf('C')!=-1)
				{
					idxr=i;
					idxc=s[i].indexOf('C');
				}
					
			}
			for(int i=0;i<r;i++)
			{
				if(i<idxr)
				{
					char ch=s[i].charAt(idxc);
					if(ch!='D')
						sum++;
						
				}
			}
			
			String s1=s[idxr];
			for(int i=0;i<s[idxr].length();i++)
			{
				char ch=s[idxr].charAt(i);
				if(ch=='D')
					sum++;
			}
			System.out.println(sum);
		}
	}

}
