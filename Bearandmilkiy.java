import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Bearandmilkiy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in); //for user input
		int t=sc.nextInt(); //test case
		while(t-->0){
		    int n=sc.nextInt();
		    String [] s=new String[n];
		    for(int i=0;i<n;i++)
		    s[i]=sc.next();//enter String
		    
		    int p=0;
		    if(s[n-1].equals("cookie")) // checking condition
		    p=1;
		    for(int i=0;i<n-1;i++){
	            if(s[i].equals("cookie") && !(s[i+1].equals("milk"))){
	                p=1;
	                break;
	                }
		    }
		    if(p==1)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
	}
}