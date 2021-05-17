
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int a= sc.nextInt();
		    int b = sc.nextInt();
		    int k =sc .nextInt();
		    if(k%2!=0){
		        a=a*2;
		    }
		    int res= Math.max(a,b)/Math.min(a,b);
		    System.out.println(res);
		    
		}
	}
}
