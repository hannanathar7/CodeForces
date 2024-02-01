import java.util.*;
public class FastFoodRestaurant {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int sum=0;
			if(a==0 && b==0 && c==0)
			{
				System.out.println("0");
				continue;
			}
			else if(a>=4 && b>=4 && c>=4)
			{
				System.out.println("7");
				continue;
			}
			if(a>0)
			{
				a--;
				sum++;
			}
			if(b>0)
			{
				b--;
				sum++;
			}
			if(c>0)
			{
				c--;
				sum++;
			}
			
			int arr[]=new int[3];
			arr[0]=a;
			arr[1]=b;
			arr[2]=c;
			Arrays.sort(arr);
			a=arr[2];
			b=arr[1];
			c=arr[0];
			
			if(a>0 && b>0)
			{
				a--;
				b--;
				sum++;
			}
			if(a>0 && c>0)
			{
				a--;
				c--;
				sum++;
			}
			if(b>0 && c>0)
			{
				b--;
				c--;
				sum++;
			}
			System.out.println(sum);	
			
		}
		sc.close();
	}
}
