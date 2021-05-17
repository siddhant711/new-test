import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minimummiximum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    PriorityQueue<Integer> pq=new PriorityQueue<>();
		    for(int i=0;i<n;i++){
		        pq.add(sc.nextInt());
		    }
		    long c=0;
		    while(pq.size()>1){
		        int a=pq.poll();
		        int b=pq.poll();
		        c+=a;
		        pq.add(a);
		    }
		    System.out.println(c);
		}
	}
}