import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char ch;
        String nstr = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Original word: " + str);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}