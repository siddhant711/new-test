import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Beautifularray{
    public static void main(String[] args) throws java.lang.Exception{
        int T;

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();//test case
        int[][] a = new int[T][];
        int n;
        for(int i=0; i<T; i++){
            n = sc.nextInt();
            a[i]=new int[n];
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }            
        }
        String[] ans = check_beauty(a,T);
        for(int i=0; i<T; i++){
            System.out.println(ans[i]);
        }
    }

    private static String[] check_beauty(int[][] arr,int T){
        String[] ans = new String[T];
        int countOne=0,countMinusOne=0,countOther=0;
    for(int i=0;i<T;i++){
        countOne=0;countMinusOne=0;countOther=0;
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]!=0&&arr[i][j]!=-1&&arr[i][j]!=1)
                countOther++;
            if(arr[i][j]==-1)
                countMinusOne++;
            if(arr[i][j]==1)
                countOne++;
            if(countOther>1) {ans[i]="no";break;}
        }
        if(countOther>1) {ans[i]="no";continue;}
        if(countOther==1&&countMinusOne>0) {ans[i]="no";continue;}
        if(countMinusOne>1&&countOne==0) {ans[i]="no";continue;}
            ans[i]="yes";
    }
    return ans;
    }
}