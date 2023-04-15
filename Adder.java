import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Adder{
    public static void main(String[] args){
        int sum = 0;
        try{
            FileReader fr = new FileReader("input.text");
            Scanner sc = new Scanner(fr);
            String str = sc.nextLine();
            for(String element : str.split(" ")){
                sum += Integer.parseInt(element);
            }
        } catch(IOException e){
            System.out.println(e);
        }
        System.out.println("Sum is "+ sum);
    }
}