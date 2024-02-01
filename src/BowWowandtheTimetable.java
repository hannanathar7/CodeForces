import java.util.*;
public class BowWowandtheTimetable {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();
		if(s.equals("0"))
		{
			System.out.println("0");
			return;
			
		}
		int idx1=s.lastIndexOf("1");
		int a[]=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		a[idx1]=0;
		for(int i=idx1+1;i<s.length();i++)
		{
			a[i]=1;
				
		}
		String s1=Arrays.toString(a).replaceAll(" ","").replaceAll(",","").replace("[","").replace("]","");
		int idx2=s1.indexOf("1");
		if(idx2==-1)
		{
			System.out.println("0");
			return;
		}
		int i=s.length()-idx2;
		int n=(int)Math.ceil(i*1.0/2);
		System.out.println(n);
		sc.close();
	}
}
