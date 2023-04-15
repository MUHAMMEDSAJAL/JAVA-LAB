import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) {
        int lines = 1, words = 0, chars = 0;
        char ch;
        try {
            FileInputStream f = new FileInputStream("input.text");

            chars = f.available();
            for (int i = 0; i < chars; i++) {
                ch = (char) f.read();
                if (ch == '\n')
                    lines++;
                else if (ch == ' ')
                    words++;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of lines : " + lines);
        System.out.println("Number of words : " + (lines + words));
        System.out.println("Number of characters : " + chars);
    }
}