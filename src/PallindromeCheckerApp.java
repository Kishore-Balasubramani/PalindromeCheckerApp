import java.util.*;
import java.util.Deque;
import java.util.LinkedList;
public class PallindromeCheckerApp {
    private static final String App_version = "1.0";

    public static void main(String[] args) {
//        System.out.println("welcome to palindrome checker management system");
//        System.out.println("Version : " + App_version);
//        System.out.println("System initialized successfully.");
//
//
//        String rev=new String("");
//        String str = new String("madam");
//        for(int i=str.length()-1;i>=0;i--){
//            rev+=str.charAt(i);
//        }
//
//        if(str.equals(rev)){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }
//
//
//        char[] chars= str.toCharArray();
//        int start=0;
//        int end= chars.length -1;
//        boolean isPalindrome= true;
//        while(start<end){
//            if(chars[start]!=chars[end]){
//                isPalindrome=false;
//                break;
//            }
//            start++; end--;
//        }
//
//        if(isPalindrome){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }
//
//
//        Stack<Character> charstack= new Stack<>();
//        for(char c:str.toCharArray()){
//           charstack.push(c);
//        }
//        String rev1=new String("");
//        while (!charstack.isEmpty()) {
//            rev1 += charstack.pop();
//        }
//        if(str.equals(rev1)){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }

        //UC6
//        boolean isPalindrome= true;
//        Queue<Character> charqueue = new LinkedList<>();
//        Stack<Character> charstack= new Stack<>();
//        for(char c:str.toCharArray()){
//            charstack.push(c);
//        }
//        for(char c:str.toCharArray()){
//            charqueue.offer(c);
//        }
//        while(!charstack.isEmpty() && !charqueue.isEmpty()){
//            char stackelement=charstack.pop();
//            char queueelement=charqueue.poll();
//            if(stackelement !=(queueelement)){
//                isPalindrome=false;
//                break;
//            }
//        }

        //UC7
        Deque<Character> deque = new LinkedList<>();

        String str = new String("madam");
        boolean isPalindrome = true;


        for(char ch : str.toLowerCase().toCharArray()){
            deque.addLast(ch);
        }
        while(deque.size()>1){
            if(!deque.removeFirst().equals(deque.removeLast())){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Is it a palindrome?: True");
        }
        else{
            System.out.println("Is it a palindrome?: false");
        }








    }





}









