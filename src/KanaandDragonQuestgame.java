import java.util.*;
public class KanaandDragonQuestgame {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int t1=1;t1<=t;t1++)
	{
	int x=sc.nextInt();
	int m=sc.nextInt();
	int n=sc.nextInt();
	while(x>0)
	{
		if(x<=20 && n==0)
		{
			break;
		}
		
		if(x>20 && m!=0)
		{
		x=((int)Math.floor(x/2))+10;
		m--;
		}
		
		if(x>=20 && n!=0 && m==0)
		{
			x=x-10;
			n--;
		}
		
		if(x<=20 && n!=0)
		{
			x=x-10;
			n--;
		}
		
		
		if(x<=20 && n==0)
		{
			break;	
		}
		
		if(n==0 && m==0)
			break;
	}
	
	if(x>0)
		System.out.println("NO");
	else
		System.out.println("YES");
	}
		
	
	sc.close();
	 }
	}

