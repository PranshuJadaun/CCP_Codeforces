import java.util.Scanner;

public class Day24_InSearchProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;
        for(int i=0;i<n;i++){
            int in = sc.nextInt();
            if(in==1){
                isHard = true;
                break;
            }
        }
        System.out.println((isHard?"HARD":"EASY"));



        sc.close();
    }
}
