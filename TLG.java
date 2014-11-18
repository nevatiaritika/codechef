package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TLG
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max=0;
		int maxwin=1;
		int p1=0, p2=0;
		for(int i=0;i<n;i++)
		{
			String s[] = br.readLine().split(" ");
			p1 += Integer.parseInt(s[0]);
			p2 += Integer.parseInt(s[1]);
			int lead = p1-p2;
			int winner = 1;
			if(lead<0)
			{
				lead = -lead;
				winner = 2;
			}
			if (lead>max)
			{
				max = lead;
				maxwin = winner;
			}
		}
		System.out.println(maxwin+" "+max);
	}
}
