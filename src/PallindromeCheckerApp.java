import java.util.*;
public class PallindromeCheckerApp {
    private static final String App_version = "1.0";
    public static void main(String[] args){
        System.out.println("welcome to palindrome checker management system");
        System.out.println("Version : " +App_version);
        System.out.println("System initialized successfully.");

//        String str = new String("madam");
//        String isPalindrome = new String("True");
//        int j= str.length();
//        for(int i=0;i<str.length()/2;i++){
//            j=j-1;
//            if(str.charAt(i)!= str.charAt(j)){
//                isPalindrome = "False";
//            }
//        }
//        if(isPalindrome.equals("True")){
//            System.out.println("is it a palindrome? : True");
//        }
//        else{
//            System.out.println("is it a palindrome? : False");
//        }

        String rev = new String("");
        String str = new String("madam");

        for(int i= str.length()-1;i>=0;i--){
            rev+= str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("is it a palindrome? : True");
        }
        else{
            System.out.println("is it a palindrome? : False");
        }
    }
    String str = new String("madam");
    String isPalindrome = new String("True");
    int j = str.length();
    // UC2
      for (int i = 0; i < str.length() / 2; i++) {
           j = j - 1;
           if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = "False";
            }
       }
        if (isPalindrome.equals("True")) {
           System.out.println("Is it a palindrome?: True");
        }else{
            System.out.println("Is it a palindrome?: False");
       }


}
