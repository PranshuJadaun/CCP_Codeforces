import java.util.Scanner;

public class Day9_PanoramixsPrediction {
    static String isgood(int n, int m) {
        boolean[] notprime = new boolean[m + 1]; // all false by default

        int i = 2;
        while (i <= m) {
            if (notprime[i]) {
                i++;
                continue;
            }
            for (int j = 2; i * j <= m; j++) {
                notprime[i * j] = true;
            }
            i++;
        }

        // Checking Sieve
        for (i = n + 1; i < m; i++) {
            if (!notprime[i]) return "NO";
        }
        if (notprime[m]) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(isgood(n, m));
        sc.close();
    }
}
