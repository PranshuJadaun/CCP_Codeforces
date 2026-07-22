import java.util.HashMap;
import java.util.Scanner;

public class Day8_Strobogrammatic {

    static int finderAt(String s) {

        HashMap<Character, Character> mp = new HashMap<>();

        mp.put('0', '0');
        mp.put('1', '1');
        mp.put('8', '8');
        mp.put('5', '5');
        mp.put('2', '2');
        mp.put('3', 'E');
        mp.put('E', '3');
        mp.put('6', '9');
        mp.put('9', '6');

        int l = 0;
        int r = s.length() - 1;
        int count = 0;

        while (l < r) {
            Character val = mp.get(s.charAt(l));

            if (val != null && val == s.charAt(r)) {
                // Found, do nothing
            } else if (mp.containsKey(s.charAt(l)) || mp.containsKey(s.charAt(r))) {
                count++;
            } else {
                count += 2;
            }

            l++;
            r--;
        }

        if (l == r) {
            char ch = s.charAt(l);
            if (!(ch == '0' || ch == '1' || ch == '8' || ch == 'A')) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(finderAt(s));

        sc.close();
    }
}
