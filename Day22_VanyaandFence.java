import java.util.Scanner;

public class Day22_VanyaandFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = 0;
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input>h) w +=2;
            else w++;
        }
        System.out.println(w);
        sc.close();
    }
}
