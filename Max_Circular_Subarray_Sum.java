
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		while(cases-- >0)
		{
		    int n = Integer.parseInt(br.readLine());
		    String temp[] = br.readLine().split(" ");
		    int arr[]  = new int[2*n-1];
		    for(int i=0;i<n;i++)
		    arr[i] = Integer.parseInt(temp[i]);
		   int[] suf = new int[n];
		   int[] pre = new int[n];
		   suf[n-1] = arr[n-1];
		   for(int i=n-2;i>=0;i--)
		   suf[i] = suf[i+1]+arr[i];
		   pre[0] = arr[0];
		   for(int i=1;i<n;i++)
		   pre[i] = pre[i-1]+arr[i];
		   int premax = 0;
		   int globalmax = arr[0],localmax = 0; 
		   for(int i=0;i<n;i++)
		   {
		       localmax = Math.max(arr[i],arr[i]+localmax);
		       globalmax = Math.max(globalmax,Math.max(localmax,suf[i]+premax));
		       premax = Math.max(premax,pre[i]);
		   }
		   System.out.println(globalmax);
		}
	}
}
