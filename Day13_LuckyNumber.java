import java.util.Scanner;

public class Day13_LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int times=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='4' || ch=='7'){
                times++;
            }
        }
        System.out.println((((times==7||times==4)?"YES":"NO")));

        sc.close();
    }
}
