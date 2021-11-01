package Lesson4445;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {                          //здесь мы считываем саму информацию из файла в виде обьектов
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");       //создаем подобный файл из библиотеки, просто запомнить
            ObjectInputStream ois = new ObjectInputStream(fis);                   //как и здесь

            try {
                serrializationAll person1 = (serrializationAll) ois.readObject();       //реализуем в таком виде
                serrializationAll person2 = (serrializationAll) ois.readObject();

                System.out.println(person1);
                System.out.println(person2);

            } catch (ClassNotFoundException e) {                           //все так же по просьбе обрабатываем
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
