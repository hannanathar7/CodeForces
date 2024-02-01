import java.util.*;
public class Square {
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		int a[]=new int[4];
		for(int i=0;i<4;i++)
			a[i]=sc.nextInt();
		int flag=0;
		for(int i=0;i<4;i++)
		{
			if(a[0]==a[1] || a[2]==a[3])
			{
				flag=1;
			}
		}
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		for(int i=0;i<4;i++)
		{
			if(map.containsKey(a[i]))
			{
				int v=map.get(a[i]);
				map.put(a[i],v+1);
			}
			else
				map.put(a[i],1);
		}
		int same=0;
		int sum=0;
		for(Integer z:map.keySet())
		{
			int v=map.get(z);
			if(v==2)
			{
				same=z;
				break;
				
			}	
		}
		for(int i=0;i<4;i++)
		{
			if(a[i]==same)
				continue;
			else
				sum=sum+a[i];
		}
		if(sum==same && flag==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		}
		sc.close();
	}

}
