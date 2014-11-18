package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NICEQUAD
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			int n = Integer.parseInt(br.readLine());
			int a,b,c,d;
			int[][] points = new int[n][2];
			for(int j=0;j<n;j++)
			{
				String[] s = br.readLine().split(" ");
				points[i][0]=Integer.parseInt(s[0]);
				points[i][1]=Integer.parseInt(s[1]);
			}
			
		}
	}
}
