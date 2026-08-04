import java.util.Scanner;

public class Day20_Marenol_2254C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            String s1 = sc.next();
            String s2 = sc.next();

            int s1Even = 0, s1Odd = 0;
            int s2Even = 0, s2Odd = 0;

            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == '1') {
                    if (i % 2 == 0)
                        s1Even++;
                    else
                        s1Odd++;
                }

                if (s2.charAt(i) == '1') {
                    if (i % 2 == 0)
                        s2Even++;
                    else
                        s2Odd++;
                }
            }

            if (s1Even == s2Even && s1Odd == s2Odd)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}