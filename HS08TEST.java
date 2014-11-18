package codechef;

import java.util.Scanner;

public class HS08TEST
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		float withdraw = sc.nextFloat();
		float initbalance = sc.nextFloat();
		sc.close();
		if(withdraw%5!=0)
		{
			System.out.println(initbalance);
			return;
		}
		else
		{
			if(withdraw+0.50>initbalance)
			{
				System.out.println(initbalance);
				return;
			}
			else
			{
				System.out.println(initbalance-withdraw-0.50);
				return;
			}
		}
	}
}
