package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIELRCPT
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			int start = 2048;
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			while(num!=0)
			{
				if(num>=start)
				{
					num = num - start;
					count++;
				}
				else
				{
					start = start/2;
				}
				
			}
			System.out.println(count);
		}
	}

}
