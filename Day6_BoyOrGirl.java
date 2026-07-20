import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean add = true;

            for (int j = 0; j < t.length(); j++) {
                if (ch == t.charAt(j)) {
                    add = false;
                    break;
                }
            }

            if (add) {
                t += ch;
            }
        }

        if (t.length() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}