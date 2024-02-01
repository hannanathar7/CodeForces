import java.util.*;
public class EvenButNotEven {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int flag=0;
			sc.nextLine();
			String s=sc.nextLine();
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				int a=Character.getNumericValue(s.charAt(i));
				list.add(a);
			}
			int last=list.get(list.size()-1);
			while(last%2==0 && list.size()>1)
			{
				list.remove(list.size()-1);
				last=list.get(list.size()-1);
			}
			int sum=0;
			String res="";
			for(int i=list.size()-1;i>=0;i--)
			{
				sum=sum+list.get(i);
				if(sum%2!=0)
				res=list.get(i)+res;
				else if(sum%2==0 && res.length()>0)
				{
					flag=1;
					res=list.get(i)+res;
					break;
				}
			}
			if(flag==1)
			System.out.println(res);
			else
				System.out.println("-1");
		}
		sc.close();
		}
}
