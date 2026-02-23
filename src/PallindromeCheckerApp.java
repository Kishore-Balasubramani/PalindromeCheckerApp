import java.util.*;
public class PallindromeCheckerApp {
    private static final String App_version = "1.0";

    public static void main(String[] args) {
        System.out.println("welcome to palindrome checker management system");
        System.out.println("Version : " + App_version);
        System.out.println("System initialized successfully.");


        String rev=new String("");
        String str = new String("madam");
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Is it a palindrome?: True");
        }else{
            System.out.println("Is it a palindrome?: False");
        }


        }



   }


