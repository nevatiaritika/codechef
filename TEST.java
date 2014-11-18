package codechef;

import java.util.Scanner;

public class TEST 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a!=42)
		{
			System.out.println(a);
			a = sc.nextInt();
		}
		sc.close();
	}
}
