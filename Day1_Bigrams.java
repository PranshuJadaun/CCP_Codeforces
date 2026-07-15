import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = 0;
            int cntTwo = 0;

            for (int i = 0; i < k; i++) {
                int x = Integer.parseInt(st.nextToken());
                max = Math.max(max, x);
                if (x == 2) cntTwo++;
            }

            if (max >= 3 || cntTwo >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}