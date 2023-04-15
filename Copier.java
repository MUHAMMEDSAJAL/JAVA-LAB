import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Copier {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.text");
            FileWriter fw = new FileWriter("output.text");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                fw.write(str);
                fw.write("\n");
                System.out.println(str);
            }
            fr.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}