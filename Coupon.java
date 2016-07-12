package Sample;
import java.util.Scanner;
import java.util.Random;

public class Coupon 
{
public static void main(String[] args) 
{
	
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter number of Coupons");
	int n=sc.nextInt();
	ran(n);
}

public static void ran(int n)
{
	Random r=new Random();
	int rn;
	
	for(int i=1;i<=n;++i)
	{
		r.nextInt();
		System.out.println(""+r);
	}
	
}

}
