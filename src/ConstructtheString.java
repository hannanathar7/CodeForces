import java.util.*;
public class ConstructtheString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s="abcdefghijklmnopqrstuvwxyz";
		char ch[]=new char[b];
		int j=0;
		for(int i=0;i<b;i++)
		{
		ch[i]=s.charAt(j);
		j++;
		}
		char ch1[]=new char[a];
		for(int i=0;i<a;i++)
		{
			ch1[i]=ch[i%b];
		}
		char ch2[]=new char[n];
		for(int i=0;i<n;i++)
		{
			ch2[i]=ch1[i%a];
		}
	

		String s1=new String(ch2);
		System.out.println(s1);
		}
		sc.close();
	}

}
