package Java_test;
import java.util.Scanner;
public class class_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Is_Prime IP=new Is_Prime();
		int a=sc.nextInt();
		IP.is_prime(a);
	}	
}
class Is_Prime
{
	public void is_prime(int a)
	{
		System.out.println("Input a number:"+a);
		boolean check=true;
		for(int i = 2; i < a;i++)
		{
			if(a%i==0)
			{
				check=false;
				break;
			}
		}
		if(check)
		{
			System.out.println(a+"	YES");
		}
		else
		{
			System.out.println(a+"	NO");
		}
	}
}