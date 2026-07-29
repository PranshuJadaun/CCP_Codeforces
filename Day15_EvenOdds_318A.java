import java.util.Scanner;

public class Day15_EvenOdds_318A {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long tE = 0;
    long tO = 0;
    long n = sc.nextLong();
    long k = sc.nextLong();
    if(n%2==0){
        tE = n/2;
        tO = n/2;
    }else{
        tO = (n/2)+1;
        tE = n/2;
    }
    boolean even = false;
    boolean odd = false;
    if(k>tO){
        k = k-tO;
        even = true;
    }else
    {
        odd = true;
    }
    
    if(even){
        System.out.println(2*k);
    }else{
        System.out.println(2*(k-1)+1);
    }
    }
}
