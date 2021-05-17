import java.util.*;
import java.lang.*;
import java.io.*;


class Grosssalary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();//no of testcase
		while(t>0)
		{
		    float salary= sc.nextInt();
		    float gross;
		    if(salary<1500)
		    {
		        gross = salary*2;
		    }
		    else{
		        gross = salary*198/100 + 500; 
		    }
		    System.out.println(gross);
		    t--;
		}
		
	}
}