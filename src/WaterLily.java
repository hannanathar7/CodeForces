import java.util.*;
public class WaterLily {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double h=sc.nextDouble();
		double l=sc.nextDouble();
		double x=0.0;
		x=((l*l)-(h*h))/(2*h);
		System.out.format("%.13f", x);
		
		sc.close();
	}
}
