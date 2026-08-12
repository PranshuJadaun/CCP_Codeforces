import java.util.Scanner;

public class Day25_GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<room;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((b-a) >= 2){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
    
}