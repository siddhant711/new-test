import java.util.Scanner;
public class idandship
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // no of test case 
        char g;
        for(int j=0;j<n;j++)
        {
            g = sc.next().charAt(0); //first character of a given string 
            if(g=='B' || g=='b') //condition checking
            {
                System.out.println("BattleShip");
            }
         if(g=='c' || g =='C')
         {
             System.out.println("Cruiser");
         }
          if(g=='d' || g =='D')
         {
             System.out.println("Destroyer");
         }
          if(g=='f' || g =='F')
         {
             System.out.println("Frigate");
         }
        }
    }
}