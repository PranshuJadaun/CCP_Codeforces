import java.util.Scanner;

class Day17_Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = 0;
        int lower = 0;
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if((int)'a' > (int)s.charAt(i)){
                upper++;
            }
            else{
                lower++;
            }
        }
        char[] ch = s.toCharArray();  
        boolean isUpper = false;
        if(upper>lower){
            isUpper = true;
        }
        for(int i=0;i<s.length();i++){
            // ch[0] : it's the value
            int val = (int)ch[i];
            if(isUpper){
                if(val>=(int)'a' && val<=(int)'z'){
                    val = val-32;
                }
            }else{
                if(val>=(int)'A' && val<=(int)'Z'){
                    val = val+32;
                }
            }
            ch[i] = (char)val;
        }
        String ans = new String(ch);
        System.out.println(ans);

    }
}