import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner myinput = new Scanner(new File("text2.csv"));
        myinput.useDelimiter(",");
        while (myinput.hasNext()){
            System.out.println(myinput.next());
        }
        myinput.close();
    }
}
