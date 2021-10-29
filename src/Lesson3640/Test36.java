package Lesson3640;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test36 {
    public static void main(String[] args) throws FileNotFoundException {     // -throws FileNotFoundException  - ннеобходимо вводить , чтобы программа выдаваала эту надпись если файл не находится
        String separator = File.separator;                     // - штука необходимая для считки адреса файла из пути
        String path = separator + "Users"+separator+"Bush"+separator+"Desktop"+ separator+"Lesson36.exe";    //сейчас схуяли то не видит

        File file = new File(path);             // создаем обьект файла

        Scanner scanner = new Scanner(file);       //считывание из файла, один из методов
        while (scanner.hasNextLine()){                  // метод запускающий считывание
            System.out.println(scanner.hasNextLine());
        }
        scanner.close();                                 //обязательо останавливаем метод, чтобы не перегружать память
    }
}
