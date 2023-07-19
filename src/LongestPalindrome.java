import java.util.Scanner;

public class LongestPalindrome {
    public static String longPalindrome(String str){
        int n = str.length();
        if(n==1) return str;
        int s = 0, e = 0;
        int left=0, right=0;
        for(int i=0; i<str.length(); i++){
            left = i-1;
            right = i+1;
            while(left>=0 && right<n && str.charAt(left)==str.charAt(right)){
                if(right-left+1 > e-s+1){
                    s = left;
                    e = right;
                }
                left--; right++;
            }
            left = i;
            right = i+1;
            while(left>=0 && right<n && str.charAt(left)==str.charAt(right)){
                if(right-left+1 > e-s+1){
                    s = left;
                    e = right;
                }
                left--; right++;
            }
        }
        return str.substring(s, e+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
String ans=longPalindrome(str);
        System.out.println(ans);
    }
}