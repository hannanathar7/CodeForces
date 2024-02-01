import java.util.*;

public class YetAnotherTwoIntegersProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long q=(long)(Math.abs(a-b)/10);
			long r=(long)(Math.abs(a-b)%10);
			if(r>0)
				System.out.println(q+1);
			else
				System.out.println(q);
		}

	}

}
