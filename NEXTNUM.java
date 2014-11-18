package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NEXTNUM
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String snum = br.readLine();
			int num = Integer.parseInt(snum);
			int digits = snum.length();
			int[] a = new int[digits];
			for(int j=0;j<digits;j++)
			{
				a[j]=snum.charAt(j)-48;
			}
			Arrays.sort(a);
			for(int j=0;j<digits;j++)
			{
				
			}
		}
	}

}
