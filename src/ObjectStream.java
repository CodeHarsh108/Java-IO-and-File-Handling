import java.io.*;

public class ObjectStream {
    static class Student implements Serializable{
        int id;
        String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student(100, "Harsh");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.ser"));
        objectOutputStream.writeObject(s);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student) objectInputStream.readObject();
        objectOutputStream.close();
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
