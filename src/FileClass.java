import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/xampp/htdocs/movie_db/index.php");
        if(file.exists()) System.out.println("Available!!!");

        File file1 = new File("new.txt");
        boolean created = file1.createNewFile();
        if(created) System.out.println("New File Created");

        File dir = new File("myDir");
        dir.mkdir();

        File dirs = new File("a/b/c");
        dirs.mkdirs();
    }
}