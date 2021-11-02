package Lesson46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject46 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream("people.bin");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Person46[] people = (Person46[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
