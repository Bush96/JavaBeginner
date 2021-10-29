package Lesson3640;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args){
        try {
            run();
        } catch (Exception e) {             //так как в классе библиотек исключений  джава находятся все нижеперечисленные исключения,
                                           // то не обязательно всех их расписывать, достаточно указать общий класс в который они все входят.

        }
    }
    public static void run() throws IOException, ParseException, IllegalAccessException{

    }
}
