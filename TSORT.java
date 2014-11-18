package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TSORT
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] a = new int [t];
		for(int i=0;i<t;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		mergeSort(a,0,t-1);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<t;i++)
		{
			bw.write(a[i]+"\n");
		}
		bw.close();
	}
	public static void mergeSort(int[] a, int low, int high)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void merge(int[]a , int low, int mid, int high)
	{
		int[] helper = new int[a.length];
		for(int i=low;i<=high;i++)
		{
			helper[i]=a[i];
		}
		int i,j,k;
		i = low;
		j = mid+1;
		k = low;
		while(i<=mid && j<=high)
		{
			if(helper[i]>helper[j])
			{
				a[k]=helper[j];
				k++;
				j++;
			}
			else
			{
				a[k]=helper[i];
				i++;
				k++;
			}
		}
		while(i<=mid)
		{
			a[k]=helper[i];
			i++;
			k++;
		}
	}
}

/**/
