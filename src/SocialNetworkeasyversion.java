import java.util.*;
public class SocialNetworkeasyversion {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		Deque<Long> deque=new ArrayDeque<Long>();
		for(int i=0;i<n;i++)
		{
			if(!(deque.contains(a[i])))
			{
				if(deque.size()==k)
				{
					deque.pollLast();
				}
				deque.addFirst(a[i]);
			}
		}
		System.out.println(deque.size());
		Iterator<Long> itr = deque.iterator(); 
	     while(itr.hasNext())
	     {
	            System.out.print(itr.next()+" "); 
	        } 
	    
		
		sc.close();
	}
}
