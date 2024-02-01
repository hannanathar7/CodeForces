import java.util.*;
public class RestorethePermutationbyMerger {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=1;k<=t;k++)
		{
			int n=sc.nextInt();
			int a[]=new int[2*n];
			for(int i=0;i<2*n;i++)
				a[i]=sc.nextInt();
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
			for(int i=0;i<2*n;i++)
			{
				set.add(a[i]);
			}
			System.out.println(set.toString().replaceAll("[\\[|\\]|]","").replace(",",""));
		}
	}

}
