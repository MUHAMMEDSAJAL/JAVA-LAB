import java.util.Scanner;
 
class Palindrome {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;  
        System.out.print("Enter any string : ");
        String str = sc.nextLine();         
         
        for(int i = 0; i < str.length(); i++)
        {
          if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            System.out.println("String is not a palindrome.");
            isPalindrome = false;
            break;
          }
        }
        if(isPalindrome) {
          System.out.println("String is a palindrome.");
        }
    }
}