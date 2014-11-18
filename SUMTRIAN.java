package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUMTRIAN 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			int n = Integer.parseInt(br.readLine());
			int[][] a = new int[n][n];
			for(int j=0;j<n;j++)
			{
				String[] in = br.readLine().split(" ");
				for(int k=0;k<in.length;k++)
				{
					a[j][k] = Integer.parseInt(in[k]);
				}
			}
			for(int j=n-2;j>=0;j--)
			{
				for(int k=0;k<=j;k++)
				{
					a[j][k] += max(a[j+1][k],a[j+1][k+1]);
				}
			}
			System.out.println(a[0][0]);
		}		 
	}
	public static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}

