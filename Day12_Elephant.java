import java.util.Scanner;

public class Day12_Elephant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = ((n%5==0)?n/5:(n/5)+1); 
        System.out.println(time+"\n");
        sc.close();

    }
}