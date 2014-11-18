package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HOLES
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String s = br.readLine();
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch = s.charAt(j);
				if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='R'||ch=='Q')
				{
					count+=1;
				}
				else if(ch=='B')
				{
					count+=2;
				}
			}
			System.out.println(count);
		}
	}
}
