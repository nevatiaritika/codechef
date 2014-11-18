package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FCTRL2 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			int num = Integer.parseInt(br.readLine());
			System.out.println(factorial(num));
		}
	}
	public static BigInteger factorial(int a)
	{
		BigInteger b =  BigInteger.valueOf(a);
		if(a==0 || a==1)
		{
			return BigInteger.valueOf(1);
		}
		else
		{
			return b.multiply(factorial(a-1));
		}
	}
}
