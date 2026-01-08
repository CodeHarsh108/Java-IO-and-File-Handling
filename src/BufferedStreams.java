import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("index.php"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();


        BufferedWriter bw = new BufferedWriter(new FileWriter("index.php"));
        bw.write("Java Buffered Streams");
        bw.newLine();
        bw.write("Harsh");
        bw.close();


        //Bytes
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("img.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("img.png"));
    }
}
