import java.util.*;
public class AniaandMinimizing {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		int a[]=new int[n];
		if(k==0)
		{
			System.out.println(s);
			sc.close();
			return;
			
		}
		if(n==1)
		{
			System.out.println(0);
			sc.close();
			return;
		}
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			a[i]=Integer.parseInt(String.valueOf(ch));
		}
		int i=0;
		if(a[0]!=1)
		{
		a[0]=1;
		k--;
		}
		i++;
		while(k>0 && i<n)
		{
			if(a[i]!=0)
			{
			a[i]=0;
			i++;
			k--;
			}
			else
			i++;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]);
		
		sc.close();
	}
}
