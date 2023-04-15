import java.io.*;
class Main {
    public static void main(String args[]) {
        String thisline;
        try {
            FileReader fr = new FileReader("input.text");
            LineNumberReader br = new LineNumberReader(fr);
            while ((thisline = br.readLine()) != null) {
                System.out.println(br.getLineNumber() + "." + thisline);
            }
        } catch (IOException e) {
            System.out.println("error:" + e);
        }
    }
}