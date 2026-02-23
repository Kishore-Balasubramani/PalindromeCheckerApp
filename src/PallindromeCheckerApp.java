import java.util.*;
public class PallindromeCheckerApp {
    private static final String App_version = "1.0";
    public static void main(String[] args){
        System.out.println("welcome to palindrome checker management system");
        System.out.println("Version : " +App_version);
        System.out.println("System initialized successfully.");

        String str = new String("madam");
        String isPalindrome = new String("True");
        int j= str.length();
        for(int i=0;i<str.length()/2;i++){
            j=j-1;
            if(str.charAt(i)!= str.charAt(j)){
                isPalindrome = "False";
            }
        }
        if(isPalindrome.equals("True")){
            System.out.println("is it a palindrome? : True");
        }
        else{
            System.out.println("is it a palindrome? : False");
        }
    }


}
