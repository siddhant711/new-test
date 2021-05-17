import java.util.*;
import java.lang.*;
import java.io.*;


public sticks
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();//no of test case
	    while(t--!=0)
	    {
	        int n=sc.nextInt(),c=0,ans=1;
	        int f[]=new int[1001];
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	            f[a[i]]++;
	        }
	        Arrays.sort(a);
	        int i=n-1;
	        while(c!=2 && i>=0)
	        {
	            //System.out.println("a["+i+"]="+a[i]+" ans="+ans);
	            if(f[a[i]]>=4 && c!=1)
	            {
	                ans=a[i]*a[i];
	                c=2;
	                break;
	            }
	            if(f[a[i]]>=2)
	            {
	                ans*=a[i];
	                f[a[i]]=0;
	                c++;
	            }
	            i--;
	        }
	        if(c==2)
	        System.out.println(ans);
	        else
	        System.out.println(-1);
	    }
	}
	
}
