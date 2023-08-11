package Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        StudentStream s1 = new StudentStream("Rohith", 26, "BSc");

        writeStudentStream(s1);
        readStudentStream("student.ser");

    }

    public static void writeStudentStream(StudentStream student) {
        try (
                FileOutputStream fileOut = new FileOutputStream("student.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);) {

            // FileOutputStream fileOut = new FileOutputStream("student.ser");
            // ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // out.writeObject(student);
            // out.close();
            // fileOut.close();

            out.writeObject(student);
            System.out.println("Wrote student object to file system");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudentStream(String file) {
        try {
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream obin = new ObjectInputStream(input);
            StudentStream student = (StudentStream) obin.readObject();
            input.close();
            obin.close();
            System.out.println("Read Serialized Object");
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getMajor());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
