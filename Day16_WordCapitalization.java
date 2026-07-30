import java.util.Scanner;

/**
 * Day16_WordCapitalization
 */
public class Day16_WordCapitalization {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char[] arr = s.toCharArray();
        char ch = arr[0];
        int val = (int)ch;
        if(val>=97 && val<=122){
           val = val - 32;
        }
        arr[0] = (char)val;
        String st = new String(arr);
        System.out.println(st);

    }
    
}