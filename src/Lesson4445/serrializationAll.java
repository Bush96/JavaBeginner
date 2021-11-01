package Lesson4445;

import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;

public class serrializationAll implements Serializable {
    /*
    public static void main(String[] args) {         \\1:команда для записи в файл только СТРОК, предварительно нужно создать текстовый документ в папке с кодом
        File fie = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();

     */

    //2: команда для сохранение в файле ОБЬЕКТОВ, этот и два других класов относится к нему
    //в этом классе мы просто начинаем создавать значения для обьекта
    private int id;
    private String name;

    public serrializationAll(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
     public String toString(){
        return id +" : " + name;
     }

    }


