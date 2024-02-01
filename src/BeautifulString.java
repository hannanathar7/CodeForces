import java.util.*;
public class BeautifulString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int t1=1;t1<=t;t1++)
		{
			String s=sc.nextLine();
			int l=s.length();
			int flag=0;
			char a[]=new char[l];
			for(int i=0;i<l-1;i++)
			{
				char ch=s.charAt(i);
				char ch1=s.charAt(i+1);
				if((ch==ch1 && ch!='?'))
				{
					
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("-1");
				continue;
			}
			if(s.length()==1)
			{
				char ch5=s.charAt(0);
				if(ch5=='?')
				{
					System.out.println("a");
					continue;
				}
				else
				{
					System.out.println(s);
					continue;
				}
			}
			char ch=s.charAt(0);
			if(ch=='?')
			{
				char ch1=s.charAt(1);
				if(ch1=='a')
					a[0]='b';
				else 
					a[0]='a';

			}
			else
				a[0]=ch;
			for(int i=1;i<l-1;i++)
			{
				char ch1=s.charAt(i);
				if(ch1=='?')
				{
					char ch2=a[i-1];
					char ch3=s.charAt(i+1);
					if(ch2=='a' && ch3=='?')
						a[i]='b';
					else if(ch2=='b' && ch3=='?')
						a[i]='a';
					else if(ch2=='c' && ch3=='?')
						a[i]='a';
					else if(ch2=='b' && ch3=='b')
						a[i]='a';
					else if(ch2=='c' && ch3=='c')
						a[i]='a';
					else if(ch2=='a' && ch3=='a')
						a[i]='b';
					else if(ch2=='a' && ch3=='b')
						a[i]='c';
					else if(ch2=='a' && ch3=='c')
						a[i]='b';
					else if(ch2=='b' && ch3=='a')
						a[i]='c';
					else if(ch2=='b' && ch3=='c')
						a[i]='a';
					else if(ch2=='c' && ch3=='a')
						a[i]='b';
					else if(ch2=='c' && ch3=='b')
						a[i]='a';
				}
				else
					a[i]=ch1;
			}
			char ch1=s.charAt(l-1);
			if(ch1=='?')
			{
				char ch2=a[l-2];
				if(ch2=='a')
					a[l-1]='b';
				else
					a[l-1]='a';
			}
			else
				a[l-1]=ch1;
			for(int i=0;i<l;i++)
				System.out.print(a[i]);
			System.out.println();
			
			
		}
		sc.close();
	}
}
