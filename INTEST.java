package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;

public class INTEST 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = (br.readLine()).split(" ");
		long n = Integer.parseInt(input[0]);
		long k = Integer.parseInt(input[1]);
		long count =0;
		long num;
		if(k!=0)
		{
			for(long i =0;i<n;i++)
			{
				num = Integer.parseInt(br.readLine());
				if(num%k==0)
					count++;
			}
		}
		br.close();
		System.out.println(count);
	}
}
