package Lesson3031;

public class Test {
    public static void main(String[] args) {
        /*
        int x =10;                  //примитивный чип данных занимающий целое число.
        short y = 2;                // целое число меньшего размера
        byte z = 120;                // целое число от -128 до 127
        long c = 110;                //целое число бльшего рамера
        double a = 12.1;              // предназначен для хранения вещественных чисел
        float s = 13.4f;               //вещественные числа, занимает меньше места

         */
        /*
        int x = 123;
        long l = x;    //явное конвертирование, само строится
        int a = l;     //неясное, нужно описыывать

         */
        int x = 123;
        long l = x;
        int a = (int)l;         //поясняем так, чтоб ве работало.

        System.out.println(a);


        /*
        Less31 - классы обертки

        int x = 1;

        Integer x2 =12;
        int y == x2;


        // Double, Float, Long, Integer, Short, Byte, Character and Boolean - классы обертки нужны для упощени кода
        присваивания примитавам каких то методов
         */



    }
}
