package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPC206
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			int num = Integer.parseInt(br.readLine());
			int count=0;
			while(palindrome(num)!=num)
			{
				int pal = palindrome(num);
				num = num + pal;
				count++;
			}
			System.out.println(count+" "+num);
		}
	}
	public static int palindrome(int n)
	{
		int palin=0;
		while(n!=0)
		{
			palin = palin*10;
			palin = palin + (n%10);
			n = n/10;
		}
		return palin;
	}
}
