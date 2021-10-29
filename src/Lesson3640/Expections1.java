package Lesson3640;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Expections1 {
    public static void main(String[] args) throws FileNotFoundException {          //читай снизу, дублируем как и говорил
        readFile();
    }
    /*
    public static void main(String[] args) throws FileNotFoundException {      // первый способ исключений throws FileNotFoundExceptio
        File file = new File("asas");

        Scanner scanner = new Scanner(file);

     */
    /*
    public static void main(String[] args)  {      // второй способ исключений try catch
        File file = new File("asas");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            /*
            e.printStackTrace();                   //стоковая поясняловка во второмисключении, ее можно менять


            System.out.println("Файл не найден");       //например на такую
        }
        */
    public static void readFile() throws FileNotFoundException {           //не имеет отношения к обоим случаям, но тема в том что
        File file = new File("asas");                           //ели в методе мы поясняем за FileNotFoundException, то должны это делать и в мэйне во второй раз, смотри самый верх

        Scanner scanner = new Scanner(file);




    }
}
