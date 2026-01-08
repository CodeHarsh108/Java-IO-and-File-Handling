import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("index.php");

//        int ch;
//        while((ch = f.read()) != 1){
//            System.out.println((char) ch);
//        }

        char[] buffer = new char[1024];
        int charReads;
        while((charReads = f.read(buffer)) != -1){
            System.out.println(new String(buffer, 0, charReads));
        }

        f.close();


        FileWriter fw = new FileWriter("index.php");
        fw.write("Hello");

    }
}
