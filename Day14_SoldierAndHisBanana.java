import java.util.Scanner;

public class Day14_SoldierAndHisBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total = 0;
        for(int i=1;i<=w;i++){
            total = total + i*k;
        }
        int give = total-n;
 
        if(give>=0) System.out.println(give+"\n");
        else System.out.println(0+"\n");

        sc.close();
    }
}
