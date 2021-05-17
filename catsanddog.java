import java.util.Scanner;

class catsanddog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//no of test case
        while (t-- > 0) {
            long cats = sc.nextLong();
            long dogs = sc.nextLong();
            long legs = sc.nextLong();
            long maxi = (4*cats) + (4*dogs);
            long mini = 0;
            if (cats > 2 * dogs) mini = 4 * (cats - dogs);
            else mini = 4 * dogs;
            if (legs % 4 == 0 && legs >= mini && legs <= maxi)
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }
}
