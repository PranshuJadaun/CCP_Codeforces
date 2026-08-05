import java.util.Scanner;

public class Day21_Translation_41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean ok = true;

        if(s1.length()==s2.length()){
            int size = s1.length();
            for(int i=0;i<size;i++){
                if(s1.charAt(i)!=s2.charAt(size-1-i)){
                    ok = false;
                    break;
                }
            }
        }
        else{
           ok = false;
        }
        System.out.println((ok?"YES":"NO"));
        sc.close();
    }
}
