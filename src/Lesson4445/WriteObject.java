package Lesson4445;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {                       //здесь мы будем записывать информацию в файл в виде обьектов
    public static void main(String[] args) {
        serrializationAll person1 = new serrializationAll(1, "Bob");       //создаем сами обьекты
        serrializationAll person2 = new serrializationAll(2, "Kenny");     //и тут

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");        //обрабатывае по просбе в таком виде
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);            //входной поток, записывает инфу, просто запомнить и юзать эту команду
            oos.writeObject(person2);

            oos.close();                       //входной поток всегда закрываем, ибо не будет работать
        } catch (IOException e) {
            e.printStackTrace();
        }                                        //параллельно в голове проекта создаем сам файл название которого мы и юзаем
    }
}
