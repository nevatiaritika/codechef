package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FCRTL
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		//finds number of zeros in n!
		//keep dividing by 5 and adding the quotient
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num;
		for(int i=0; i<n;i++)
		{
			num = Integer.parseInt(br.readLine());
			int count=0;
			while(num>=5)
			{
				count = count + (num/5);
				num = num/5;
			}
			System.out.println(count);
		}
	}
}
