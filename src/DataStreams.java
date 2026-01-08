import java.io.*;

public class DataStreams {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("index.php"));
        dos.writeInt(646);
        dos.writeBoolean(false);
        dos.writeChar('H');
        dos.writeUTF("Harsh");
        dos.close();


        DataInputStream dis = new DataInputStream(new FileInputStream("index.php"));
        int i = dis.readInt();
        boolean b = dis.readBoolean();
        char c = dis.readChar();
        String s = dis.readUTF();
        dis.close();

        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);

    }
}
