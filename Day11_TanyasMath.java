import java.util.Scanner;

public class Day11_TanyasMath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(k>0){
            if(n%10==0){
                n /= 10;
            }else{
                n--;
            }
            k--;
        }
        System.out.println(n+"\n");

    }
}