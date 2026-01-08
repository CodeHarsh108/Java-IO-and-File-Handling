import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("index.php");
        int b ;
        while((b = fis.read()) != -1){
            System.out.println(b);
        }
        fis.close();


        FileOutputStream fos = new FileOutputStream("index.php");
        fos.write(65);
        fos.close();
    }
}
