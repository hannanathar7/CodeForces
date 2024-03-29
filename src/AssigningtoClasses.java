import java.util.*;
public class AssigningtoClasses {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			long a[]=new long[2*n];
			for(int i=0;i<2*n;i++)
				a[i]=sc.nextLong();
			sort(a,0,2*n-1);
			long x=a[n];
			long y=a[n-1];
			long diff=x-y;;
			System.out.println(diff);
		}
		sc.close();
	}
	
	public static void sort(long a[],int l,int r)
	{
		if(l<r)
		{
		int m=(l+r)/2;
		sort(a,l,m);
		sort(a,m+1,r);
		merge(a,l,m,r);
		}
		
	}
	
	public static void merge(long a[],int l,int m,int r)
	{
			int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        long L[] = new long[n1];
	        long R[] = new long[n2];
	        
	        
	        
	        for (int i = 0; i < n1; ++i)
	            L[i] = a[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = a[m + 1 + j];
	        
	        int i = 0, j = 0;
	        
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                a[k] = L[i];
	                i++;
	            }
	            else {
	                a[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        
	        while (i < n1) {
	            a[k] = L[i];
	            i++;
	            k++;
	        }
	 
	    
	        while (j < n2) {
	            a[k] = R[j];
	            j++;
	            k++;
	        }
	}
}
