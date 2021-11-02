package Lesson46;

import Lesson4445.Person46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject46 {
    public static void main(String[] args) {
        Person46[] people = {new Person46(1,"Bob"),
                new Person46(2,"Kenny"), new Person46(3,"Piter")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");        //обрабатывае по просбе в таком виде
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);
            fos.close();                       //входной поток всегда закрываем, ибо не будет работать
        } catch (IOException e) {
            e.printStackTrace();
        }                                        //параллельно в голове проекта создаем сам файл название которого мы и юзаем
    }
    }

