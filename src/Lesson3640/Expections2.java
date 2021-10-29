package Lesson3640;

import java.io.IOException;
import java.util.Scanner;

public class Expections2 {
    public static void main(String[] args) throws IOException, ScannerExpection {
        Scanner scanner = new Scanner(System.in);              //строка которая говорит что в программе мы будем чтото вводить
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());       //условие что вводить мы будем цифры
/*
            if (x !=0){                                         //условие, чо вводить мы должны только ноль, либо
                throw new IOException();
                                     //будет работать этоиключение из библиотеки джава.
 */
            if (x !=0){
                throw new ScannerExpection("Пользователь ввел не то");    //второй способ исключения которое мы создани сами в виде класса ScannerExpection.
                                                                                    //нужен  если в библиотеке не нашли подходящее себе исключение
                }
            }
        }
    }

