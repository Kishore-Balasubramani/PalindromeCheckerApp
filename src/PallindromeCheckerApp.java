import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
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
//        Deque<Character> deque = new LinkedList<>();
//
//        String str = new String("madam");
//        boolean isPalindrome = true;
//
//
//        for(char ch : str.toLowerCase().toCharArray()){
//            deque.addLast(ch);
//        }
//        while(deque.size()>1){
//            if(!deque.removeFirst().equals(deque.removeLast())){
//                isPalindrome = false;
//            }
//        }
//        if(isPalindrome){
//            System.out.println("Is it a palindrome?: True");
//        }
//        else{
//            System.out.println("Is it a palindrome?: false");
//        }

        //UC8

//        LinkedList<Character> LinkedList = new LinkedList<>();
//
//        String str = new String("madam");
//        boolean   isPalindrome = true;
//
//        for(char ch: str.toLowerCase().toCharArray()){
//            LinkedList.addLast(ch);
//        }
//        while(LinkedList.size()>1){
//            if(!LinkedList.removeFirst().equals(LinkedList.removeLast())){
//                isPalindrome = false;
//            }
//        }
//
//        if(isPalindrome){
//            System.out.println("Is it a palindrome?: True");
//        }
//        else{
//            System.out.println("Is it a palindrome?: false");
//        }

        //UC9
//        String str = "Racecar";
//        str = str.toLowerCase().replaceAll("\\s+", ""); // ignore spaces and case
//
//        boolean result = isPalindrome(str, 0, str.length() - 1);
//
//        if (result) {
//            System.out.println("Is it a palindrome?: True");
//        } else {
//            System.out.println("Is it a palindrome?: False");
//        }
        //UC10
//        String str = new String("My name is Billa");
//        String processed = str.toLowerCase().replaceAll("[^a-zA-z0-9]","");
//        String rev = new StringBuilder(processed).reverse().toString();
//
//        if(processed.equals(rev)){
//            System.out.println("Is it a palindrome?: True");
//        }
//        else {
//            System.out.println("Is it a palindrome?: False");
//
//        }

       //UC11
    //     String str = new String("civic");

    //     String processed = preprocess(str);
    //     boolean result = isPalindrome(processed);

    //     printResult(result);





    // }
    // private static String preprocess(String str) {
    //     return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    // }
    // private static boolean isPalindrome(String str) {
    //     int start = 0;
    //     int end = str.length() - 1;

    //     while (start < end) {
    //         if (str.charAt(start) != str.charAt(end)) {
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }
    // private static void printResult(boolean result) {
    //     System.out.println(result ? "Palindrome" : "Not a Palindrome");
    // }

    //public static boolean isPalindrome(String s, int start, int end) {
        //if (start >= end) return true;
        //       if (s.charAt(start) != s.charAt(end)) return false;
//        return isPalindrome(s, start + 1, end - 1);
// UC12
 String text = scanner.nextLine();

        System.out.println("Choose algorithm:");
        System.out.println("1 - Stack");
        System.out.println("2 - Deque");

        int choice = scanner.nextInt();
        PalindromeStrategy strategy;

        
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.isPalindrome(text);
        System.out.println("Is it a palindrome?: " + result);


    }
}












    


    
    
























