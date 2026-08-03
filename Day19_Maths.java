import java.util.Scanner;
import java.util.Arrays;

public class Day19_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String[] parts = s.split("\\+");
        int[] nums = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i != nums.length - 1) sb.append("+");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}
